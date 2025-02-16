package org.example.Day05.junittesting.basicproblems.testexceptionhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionHandlingTest {

    @Test
    void divide() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        });
        assertEquals("Invalid argument", exception.getMessage());
    }
        @Test
        public void testDivideValid() {
            int result = ExceptionHandling.divide(10, 2);
            assertEquals(5, result);
        }
    }

