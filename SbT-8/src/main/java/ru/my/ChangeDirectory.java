package ru.my;

import java.io.File;
import java.io.IOException;

public class ChangeDirectory implements Command{
    String s;
    public ChangeDirectory(String s){
        this.s = s;
    }
    @Override
    public String getName() {
        return "ChangeDirectory";
    }

    @Override
    public String getDescription() {
        Shell sh = new Shell();
        String command = s;
        String path = command.substring(3).trim();
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
