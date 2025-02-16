package org.example.Day05.regex.advancedproblems.programminglangnames;

import java.util.List;

import static org.example.Day05.regex.advancedproblems.programminglangnames.ProgrammingLanguageExtractor.extractLanguages;

public class Main {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = extractLanguages(text);

        System.out.println(String.join(", ", languages));
    }
}
