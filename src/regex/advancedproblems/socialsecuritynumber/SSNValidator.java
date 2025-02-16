package org.example.Day05.regex.advancedproblems.socialsecuritynumber;

import java.util.regex.*;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);
        return matcher.matches();
    }
}
