package org.example.Day05.regex.extractionproblem.extractallemailaddresses;

public class Main {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org ";
        System.out.println(EmailValidation.extractEmails(text));
    }
}