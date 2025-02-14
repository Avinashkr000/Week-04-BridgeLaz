package org.example.Day02.queueinterface.binarynumberusingqueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryNumbersTest {

    @Test
    void testGenerateBinaryNumbersWithPositiveNumber() {
        List<String> result = BinaryNumbers.generateBinaryNumbers(5);
        assertEquals(List.of("1", "10", "11", "100", "101"), result, "Binary numbers generation with n=5 is incorrect");
    }

    @Test
    void testGenerateBinaryNumbersWithZero() {
        List<String> result = BinaryNumbers.generateBinaryNumbers(0);
        assertTrue(result.isEmpty(), "Result should be empty for n=0");
    }

    @Test
    void testGenerateBinaryNumbersWithNegativeNumber() {
        List<String> result = BinaryNumbers.generateBinaryNumbers(-1);
        assertTrue(result.isEmpty(), "Result should be empty for negative n");
    }
}