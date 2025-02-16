package org.example.Day05.regex.basicregexproblems.validatealicenseplatenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a license plate number : ");
        String input = sc.nextLine();
        if (ValidateALicensePlate.isValidLicensePlate(input)) {
            System.out.println("Valid: " + input);
        } else {
            System.out.println("Invalid: " + input);
        }
    }
}
