package org.example.Day05.junittesting.basicproblems.parameterizedtest;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestEvenTest {


    @ParameterizedTest
    @ValueSource(ints = {4, 6})
    void testIsEvenWithEvenNumber(int number) {
        assertTrue(TestEven.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(TestEven.isEven(number));
    }
}