package org.example.Day05.regex.advancedproblems.currencyvalues;

import java.util.List;

import static org.example.Day05.regex.advancedproblems.currencyvalues.CurrencyExtractor.extractCurrencyValues;

public class Main {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> values = extractCurrencyValues(text);

        System.out.println(String.join(", ", values));
    }
}
