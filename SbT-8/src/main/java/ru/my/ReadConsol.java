package ru.my;

import java.util.Scanner;
public class ReadConsol implements InPut{
    public Scanner scanner = new Scanner(System.in);
    @Override
    public Boolean hasNext(String command) { // Читаем команды пока не exit
//        Scanner scanner = new Scanner(System.in);
//        command = scanner.nextLine();
        if((!command.equals("exit"))){
            return true;
        }else{
            return false;
        }
    }
}
