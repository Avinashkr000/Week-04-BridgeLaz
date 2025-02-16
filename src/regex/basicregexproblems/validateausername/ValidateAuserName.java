package org.example.Day05.regex.basicregexproblems.validateausername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAuserName {
    static boolean isvalidateUserName(String input) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}