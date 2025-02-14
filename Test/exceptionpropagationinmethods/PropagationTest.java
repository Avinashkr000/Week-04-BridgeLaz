package org.example.Day04.exceptionpropagationinmethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropagationTest {

    @Test
    void testMethod1ThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, Propagation::method1);
    }

    @Test
    void testMethod2ThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, Propagation::method2);
    }
}