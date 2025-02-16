package org.example.Day05.regex.extractionproblem.extractdates;

public class Main {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println(FindDates.findDates(text));
    }
}
