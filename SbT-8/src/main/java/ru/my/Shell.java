package ru.my;
import java.io.File;
import java.util.Scanner;
//Bild машина
public class Shell{
    private OutPut op;
    private InPut  ip;
    private Analyzer an;
    public File newDir = new File(System.getProperty("user.dir"));
    public Shell(){ // для использования newDir в других классах
    }
    public Shell(InPut ip, Analyzer an, OutPut op){
        this.ip = ip;
        this.an = an;
        this.op = op;
    }
    private void exec(){ //Читаем
        String s ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print(newDir.getAbsolutePath() + " > ");
        String command = scanner.nextLine();
        while (ip.hasNext(command)){
            s = an.analyze(command);
            op.report(s);
            command = scanner.nextLine();
        }
//        op.report(an.analyze(scanner.nextLine()));
    }

    public static void main(String[] args) { //Запуск
        InPut ip = new ReadConsol();
        Analyzer an = new CommandAnalyzer();
        OutPut op = new Writer();
        Shell sh = new Shell(ip, an, op);
//        Scanner scanner = new Scanner(System.in);
        sh.exec();
    }
}
