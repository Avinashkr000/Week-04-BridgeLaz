package org.example.Day05.regex.basicregexproblems.validateahexcolorcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex color code : ");
        String input = sc.nextLine();
        ValidateAHexColourCode.validateHexColorCode(input);
    }
}
