package org.example.Day05.regex.replaceandmodifystrings.censorwords;

public class CensorBadWords {
    public static String censorBadWords(String sentence, String[] badWords) {
        for (String word : badWords) {
            sentence = sentence.replaceAll("\\b" + word + "\\b", "****");
        }
        return sentence;
    }
}
