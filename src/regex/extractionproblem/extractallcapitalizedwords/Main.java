package org.example.Day05.regex.extractionproblem.extractallcapitalizedwords;

public class Main {
    public static void main(String[] args) {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println(CapitalizedWordsFromASentence.extractCapitalizedWords(sentence));
    }
}
