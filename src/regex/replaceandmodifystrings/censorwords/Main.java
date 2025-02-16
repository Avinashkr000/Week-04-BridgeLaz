package org.example.Day05.regex.replaceandmodifystrings.censorwords;

public class Main {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};
        String sentence = "This is a damn bad example with some stupid words.";
        System.out.println(CensorBadWords.censorBadWords(sentence, badWords));
    }
}
