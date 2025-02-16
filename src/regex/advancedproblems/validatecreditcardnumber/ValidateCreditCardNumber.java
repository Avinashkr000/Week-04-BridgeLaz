package org.example.Day05.regex.advancedproblems.validatecreditcardnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static boolean validateCardNumber(String cardNumber) {
        String regex = "^[45]\\d{15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);
        return matcher.matches();
    }
}
