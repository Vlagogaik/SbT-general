package ru.my;

import java.io.File;

public class ListDirectory implements Command{
    Shell sh;
    public ListDirectory() {

    }

    @Override
    public String getName() {
        return "ls";
    }

    @Override
    public String getDescription() {
        File currentDir = new File(System.getProperty("user.dir"));
        File[] files = currentDir.listFiles();
        StringBuilder sb = new StringBuilder();
        for (File file : files) {
            if (file.isDirectory()) {
                sb.append("[Folder] ");
            }
            sb.append(file.getName());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    @Override
    public String exec() {
        return getDescription();
    }


}
