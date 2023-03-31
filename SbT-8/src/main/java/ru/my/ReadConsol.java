package ru.my;

import java.util.Scanner;
public class ReadConsol implements InPut{
    private String s;
    @Override
    public Boolean hasNext(String command) { // Читаем команды пока не exit
        s = command;
        if((!command.equals("exit"))){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getCommand() {
        ReadConsol rc = new ReadConsol();
        return rc.s;
    }
}
