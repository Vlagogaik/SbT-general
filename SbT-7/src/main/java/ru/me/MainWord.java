package ru.me;
import java.io.*;
import java.util.*;

public class MainWord {
    private static Map<String, Integer> Allword = new HashMap<>();
    public static void Wa(){
        try {
            Scanner scanner = new Scanner(new File("Oleg.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (Allword.containsKey(word)) {
                        Allword.put(word, Allword.get(word) + 1);
                    } else {
                        Allword.put(word, 1);
                    }
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error: you are not Oleg");
        }
    }

    public static void main(String[] args) {
        Wa();
        for (Map.Entry<String, Integer> entry : Allword.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
