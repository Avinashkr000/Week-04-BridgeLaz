package org.example.Day02.mapinterface.wordfrequencycounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\IDE\\Week04\\src\\main\\java\\org\\example\\Day02\\mapinterface\\wordfrequencycounter\\input.txt");
        Scanner scanner = new Scanner(file);
        Map<String, Integer> wordFrequency = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        scanner.close();
        System.out.println(wordFrequency);
    }
}