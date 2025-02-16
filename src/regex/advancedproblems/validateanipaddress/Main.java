package org.example.Day05.regex.advancedproblems.validateanipaddress;

import static org.example.Day05.regex.advancedproblems.validateanipaddress.ValidateAnIPAddress.validateIPAddress;

public class Main {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println(validateIPAddress(ip));
    }
}