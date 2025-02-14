package org.example.Day04.throwvsthrows;

public class Main {

    public static void main(String[] args) {
        try {
            double interest = ThrowVsThrows.calculateInterest(-10000, 5, 2);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
