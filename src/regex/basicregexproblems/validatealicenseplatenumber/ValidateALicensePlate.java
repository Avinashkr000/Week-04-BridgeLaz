package org.example.Day05.regex.basicregexproblems.validatealicenseplatenumber;


import java.util.Scanner;
import java.util.regex.*;

public class ValidateALicensePlate {
    static boolean isValidLicensePlate(String input) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}


