package ru.me;
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class MainBookTXT implements Report {

    public Map<String, Integer> Allword = new HashMap<>();
    private String nameFile;


    public MainBookTXT(String nameFile) {
        this.nameFile = nameFile;
    }


    private void Аnalysis(){
        try (Scanner scanner = new Scanner(new File(nameFile))){
//            Scanner scanner = new Scanner(new File("Oleg.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (Allword.containsKey(word)) {
                        Allword.put(word, Allword.get(word) + 1);
                    } else {
                        Allword.put(word, 1);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void GetResInConsole(){
        Аnalysis();
        for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Allword.clear();
    }

    private void GetResInPDF(String fileName){
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

    private void GetResInDOC() {
        try {
            Аnalysis();
            XWPFDocument document = new XWPFDocument();
            XWPFParagraph paragraph = document.createParagraph();
            for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
                XWPFRun run = paragraph.createRun();
                run.setText(entry.getKey() + ": " + entry.getValue());
                run.setFontFamily("Arial");
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
            GetResInPDF("Result.pdf");
        }
        if((s.equals("Console")) || (s.equals("console"))){
            GetResInConsole();
        }
        if((s.equals("docx")) || (s.equals("doc")) || (s.equals("DOC")) || (s.equals("DOCX"))){
            GetResInDOC();
        }
    }
//    public static void main(String[] args) {
//        if (args.length < 1) {
//            MainWordTXT inwa = new MainWordTXT("Oleg.txt");
//            inwa.GetResInPDF("Res.pdf");
//            inwa.GetResInConsole();
//        }else{
//            MainWordTXT inwa = new MainWordTXT(args[0]);
//            inwa.GetResInPDF("Res.pdf");
//            inwa.GetResInConsole();
//        }
//
//    }
}