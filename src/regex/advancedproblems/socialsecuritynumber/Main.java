package org.example.Day05.regex.advancedproblems.socialsecuritynumber;

import java.util.Scanner;

import static org.example.Day05.regex.advancedproblems.socialsecuritynumber.SSNValidator.isValidSSN;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SSN Number : ");
        String ssn1 = sc.nextLine();

        if (isValidSSN(ssn1)) {
            System.out.println(ssn1 + "\" is valid");
        } else {
            System.out.println(ssn1 + "\" is invalid");
        }
    }
}
