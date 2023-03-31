package ru.my;

import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;

// Анализатор который выводит результат методов
public class CommandAnalyzer implements Analyzer{
    ReadConsol rc = new ReadConsol();
    Shell sh = new Shell();
    @Override
    public String analyze(String command) {
        if (command.startsWith("cd")) {
            String path = command.substring(3).trim();
            return changeDirectory(path);
        }
        switch (command) {
            case "time":
                return printCurrentTime();
            case "date":
                return printCurrentDate();
            case "ls":
                return listDirectory();
            case "pwd":
                return printWorkingDirectory();
            default:
                return unknowCommand();
        }
    }
    private String unknowCommand(){ // хз что ввел
        return "Unknown command.";
    }
    private String printCurrentTime(){ // Покажет время
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatter.format(now);
    }
    private String printCurrentDate(){ // Дату покажет
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(now);
    }
    private String listDirectory(){ // Что находиться в директории
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



    private String printWorkingDirectory(){ //Выводит путь директории
        return sh.newDir.getAbsolutePath();
    }

    private String changeDirectory(String path) { // меняем директорию
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




}
