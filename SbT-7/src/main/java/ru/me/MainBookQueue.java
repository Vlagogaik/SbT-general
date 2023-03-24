package ru.me;
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;

public class MainBookQueue implements Report {
    public Map<String, Integer> Allword = new HashMap<>();
    private String nameFile;


    public MainBookQueue(String nameFile) {
        this.nameFile = nameFile;
    }

    private void Аnalysis() {
        try (Scanner scanner = new Scanner(new File(nameFile))) {
            Queue<String> wordQueue = new LinkedList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    wordQueue.offer(word);
                }
            }
            scanner.close();

            while (!wordQueue.isEmpty()) {
                String word = wordQueue.poll();
                if (Allword.containsKey(word)) {
                    Allword.put(word, Allword.get(word) + 1);
                } else {
                    Allword.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void WriteTOConsole() {
        Аnalysis();
        for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Allword.clear();
    }


    private void WriteToPDF(String fileName) {
        Аnalysis();
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            BaseFont bf = BaseFont.createFont("c:/windows/fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(bf, 12);
            for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
                String line = new String();
                line = entry.getKey() + ": " + entry.getValue();
                Paragraph paragraph = new Paragraph(line, font);
                document.add(paragraph);
            }
            document.newPage();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
        Allword.clear();
    }
    private void WriteToDoc() {
        try {
            Аnalysis();
            XWPFDocument document = new XWPFDocument();
            XWPFParagraph paragraph = document.createParagraph();
            for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
                XWPFRun run = paragraph.createRun();
                run.setText(entry.getKey() + ": " + entry.getValue());
                run.setFontFamily("Times New Roman");
                run.addBreak();
            }
            Allword.clear();
            FileOutputStream out = new FileOutputStream("Result.docx");
            document.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Writer(String s) {
        if((s.equals("PDF")) || (s.equals("pdf"))){
            WriteToPDF("Result.pdf");
        }
        if((s.equals("Console")) || (s.equals("console"))){
            WriteTOConsole();
        }
        if((s.equals("docx")) || (s.equals("doc")) || (s.equals("DOC")) || (s.equals("DOCX"))){
            WriteToDoc();
        }
    }
}
