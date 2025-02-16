package org.example.Day05.junittesting.basicproblems.testcalculatorclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
 Calculator calculator= new Calculator();
    @Test
    void add() {
        assertEquals(6 , calculator.add(2,4));
    }

    @Test
    void substract() {
        assertEquals(6 , calculator.substract(10,4));

    }

    @Test
    void multiply() {
        assertEquals(6 , calculator.multiply(2,3));

    }

    @Test
    void divide() {
        assertEquals(6 , calculator.divide(24,4));

    }
}