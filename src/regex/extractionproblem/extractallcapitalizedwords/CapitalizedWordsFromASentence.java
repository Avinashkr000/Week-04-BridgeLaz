package org.example.Day05.regex.extractionproblem.extractallcapitalizedwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsFromASentence {
    public static List<String> extractCapitalizedWords(String sentence) {
        List<String> capitalizedWords = new ArrayList<>();
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }
}
