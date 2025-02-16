package org.example.Day05.regex.advancedproblems.currencyvalues;

import java.util.regex.*;
import java.util.*;

public class CurrencyExtractor {
    public static List<String> extractCurrencyValues(String text) {
        List<String> values = new ArrayList<>();
        String regex = "\\$?\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }
}
