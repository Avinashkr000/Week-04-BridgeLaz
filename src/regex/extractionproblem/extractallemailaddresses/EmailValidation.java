package org.example.Day05.regex.extractionproblem.extractallemailaddresses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;


public class EmailValidation {
    static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        String regex = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}
