package org.example.Day05.regex.basicregexproblems.validateausername;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (ValidateAuserName.isvalidateUserName(input)) {
            System.out.println("Valid: " + input);
        } else {
            System.out.println("Invalid: " + input);
        }
    }

}
