package org.example.Day05.regex.advancedproblems.programminglangnames;

import java.util.regex.*;
import java.util.*;

public class ProgrammingLanguageExtractor {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
}

