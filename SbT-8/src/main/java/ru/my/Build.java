package ru.my;

import java.util.Scanner;

public class Build {

    public static void main(String[] args) { //Запуск
        Shell sh = new Shell();
        Writer wr = new Writer();
        Scanner scanner = new Scanner(System.in);
        sh.addCommand(new CurrentTime());
        sh.addCommand(new CurrentDate());
        sh.addCommand(new ListDirectory());
        sh.addCommand(new WorkingDirectory());
        sh.addCommand(new ChangeDirectory(sh));
        sh.addCommand(new UnknowCommand());
        wr.report(sh, scanner);
    }
}
