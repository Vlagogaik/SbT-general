package ru.my;
import java.io.File;
import java.util.Scanner;
//Bild машина
public class Shell{
    private OutPut op;
    private InPut  ip;
    private Command an;
    public File newDir = new File(System.getProperty("user.dir"));
    public Shell(){ // для использования newDir в других классах
    }

    public Shell(OutPut op, InPut ip, Command an) {
        this.op = op;
        this.ip = ip;
        this.an = an;
    }

    public String analyze(String command) {
        Command cmd;
        Command an;
        if (command.startsWith("cd")) {
            cmd = new ChangeDirectory(command);
            this.an = new ChangeDirectory(command);
            return cmd.exec();
        }
        switch (command) {
            case "time":
                cmd = new CurrentTime();
                this.an = new CurrentTime();
                break;
            case "date":
                cmd = new CurrentDate();
                this.an = new CurrentDate();
                break;
            case "ls":
                cmd = new ListDirectory();
                this.an = new ListDirectory();
                break;
            case "pwd":
                cmd = new WorkingDirectory();
                this.an = new WorkingDirectory();
                break;
            default:
                cmd = new UnknowCommand();
                this.an = new UnknowCommand();
                return cmd.exec();
        }
        return cmd.exec();
    }


    private void exec(){ //Читаем
        String s ="";
        this.op = new Writer();
        this.ip = new ReadConsol();
        Scanner scanner = new Scanner(System.in);
        System.out.print(newDir.getAbsolutePath() + " > ");
        String command = scanner.nextLine();
        while (ip.hasNext(command)){
            s = analyze(command);
            op.report(s);
            command = scanner.nextLine();
        }
    }

    public static void main(String[] args) { //Запуск
        Shell sh = new Shell();
        sh.exec();
    }
}
