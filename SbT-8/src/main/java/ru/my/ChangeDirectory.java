package ru.my;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ChangeDirectory implements Command{
    String s;
    Scanner scanner;
    Shell sh;
    public ChangeDirectory(Shell sh){
        this.sh = sh;
    }
    public ChangeDirectory(){
    }
    @Override
    public String getName() {
        return "cd";
    }

    @Override
    public String getDescription() {
        String command = s;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Which directory should I change to?");
        String path = scanner1.nextLine();
//        String path = command.substring(3).trim();
        File newDir = new File(path);
        if (!newDir.isDirectory()) {
            return "No such directory";
        }
        try {
            sh.newDir = newDir;
            System.setProperty("user.dir", sh.newDir.getCanonicalPath());
            return "";
        } catch (IOException e) {
            return "Error changing directory";
        }
    }

    @Override
    public String exec() {
        return getDescription();
    }


}
