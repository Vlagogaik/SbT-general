package ru.me;
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;

public class MainWordTXT implements Word{

    public Map<String, Integer> Allword = new HashMap<>();
    private String nameFile;


    public MainWordTXT(String nameFile) {
        this.nameFile = nameFile;
    }

    @Override
    public void Wa(){
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
    @Override
    public void GetResInConsole(){
        Wa();
        for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Allword.clear();
    }
    @Override
    public void GetResInPDF(String fileName){
        Wa();
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