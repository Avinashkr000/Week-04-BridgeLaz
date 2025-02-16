package org.example.Day05.junittesting.advancedproblems.strengthvalidator;

import java.util.regex.Pattern;

public class PasswordValidator {
    private static final int MIN_LENGTH = 8;
    private static final String UPPERCASE_PATTERN = ".*[A-Z].*";
    private static final String DIGIT_PATTERN = ".*\\d.*";

    public static boolean isValid(String password) {
        if (password == null || password.length() < MIN_LENGTH) {
            return false;
        }
        if (!Pattern.matches(UPPERCASE_PATTERN, password)) {
            return false;
        }
        if (!Pattern.matches(DIGIT_PATTERN, password)) {
            return false;
        }
        return true;
    }
}

