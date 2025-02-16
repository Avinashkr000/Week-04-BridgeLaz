package org.example.Day05.regex.replaceandmodifystrings.multiplespaceswithasinglespace;

import java.util.ArrayList;
import java.util.List;

public class MultipleSpaces {
    static String replaceMultipleSpaces(String str) {
        List<String> text = new ArrayList<>();
        String regex = "\\s+";
        String[] words = str.split(regex);
        for (String word : words) {
            text.add(word);
        }
        return String.join(" ", text);
    }
}
