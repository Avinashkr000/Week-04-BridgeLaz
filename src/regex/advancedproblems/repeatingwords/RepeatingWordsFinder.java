package org.example.Day05.regex.advancedproblems.repeatingwords;

import java.util.regex.*;
import java.util.*;

public class RepeatingWordsFinder {
    public static List<String> findRepeatingWords(String text) {
        List<String> repeatingWords = new ArrayList<>();
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group(1);
            if (!repeatingWords.contains(word)) {
                repeatingWords.add(word);
            }
        }
        return repeatingWords;
    }
}
