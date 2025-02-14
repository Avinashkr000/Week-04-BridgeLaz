package org.example.Day04.customexception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.example.Day04.customexception.CustomException;
import org.example.Day04.customexception.InvalidAgeException;

public class InvalidAgeExceptionTest {

    @Test
    void testValidateAge_ValidAge() {
        assertDoesNotThrow(() -> CustomException.validateAge(18));
        assertDoesNotThrow(() -> CustomException.validateAge(25));
    }

    @Test
    void testValidateAge_InvalidAge() {
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> CustomException.validateAge(15));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}