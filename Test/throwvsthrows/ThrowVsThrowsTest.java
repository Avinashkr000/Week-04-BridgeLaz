package org.example.Day04.throwvsthrows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThrowVsThrowsTest {

    @Test
    void testCalculateInterestWithValidInputs() {
        double result = ThrowVsThrows.calculateInterest(1000, 5, 2);
        assertEquals(100.0, result, "The calculated interest should be 100.0");
    }

    @Test
    void testCalculateInterestWithNegativeAmount() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> ThrowVsThrows.calculateInterest(-1000, 5, 2),
                "Expected IllegalArgumentException for negative amount"
        );
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterestWithNegativeRate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> ThrowVsThrows.calculateInterest(1000, -5, 2),
                "Expected IllegalArgumentException for negative rate"
        );
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterestWithZeroYears() {
        double result = ThrowVsThrows.calculateInterest(1000, 5, 0);
        assertEquals(0.0, result, "The calculated interest should be 0.0 for zero years");
    }
}