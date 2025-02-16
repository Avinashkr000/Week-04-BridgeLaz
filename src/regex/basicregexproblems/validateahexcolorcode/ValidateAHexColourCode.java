package org.example.Day05.regex.basicregexproblems.validateahexcolorcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAHexColourCode {

    public static void validateHexColorCode(String input) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid: " + input);
        } else {
            System.out.println("Invalid: " + input);
        }
    }

}
