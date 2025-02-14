package org.example.Day04.throwvsthrows;

public class ThrowVsThrows {

    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {
        if (amount<0||rate<0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return amount*rate*years / 100;
    }
}
