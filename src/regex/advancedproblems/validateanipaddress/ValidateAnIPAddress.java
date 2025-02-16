package org.example.Day05.regex.advancedproblems.validateanipaddress;

import java.util.regex.*;

public class ValidateAnIPAddress {
    public static String validateIPAddress(String ip) {
        String regex = "^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            for (int i = 1; i <= 4; i++) {
                int num = Integer.parseInt(matcher.group(i));
                if (num < 0 || num > 255) {
                    return "Invalid IP Address";
                }
            }
            return "Valid IP Address";
        } else {
            return "Invalid IP Address";
        }
    }
}
