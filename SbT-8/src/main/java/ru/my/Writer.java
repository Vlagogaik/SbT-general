package ru.my;

import java.util.Scanner;

//Класс для вывода того что там анализатор на анализировал
public class Writer implements OutPut{
    public String input;
//    Shell sh = new Shell();

//    @Override
//    public void report(String s) {
//
//        Shell sh = new Shell();
//        System.out.println(s);
//        System.out.print(sh.newDir.getAbsolutePath() + " > ");
//    }
    @Override
    public void report(Shell sh, Scanner scanner){
        while (true) {
            System.out.print(sh.newDir.getAbsolutePath() + " > ");
            input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            System.out.println(sh.executeCommand(input));
        }
    }
}
