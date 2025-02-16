package org.example.Day05.regex.advancedproblems.repeatingwords;

import java.util.List;

import static org.example.Day05.regex.advancedproblems.repeatingwords.RepeatingWordsFinder.findRepeatingWords;

public class Main {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        List<String> repeatingWords = findRepeatingWords(text);

        System.out.println(String.join(", ", repeatingWords) + " .");
    }
}
