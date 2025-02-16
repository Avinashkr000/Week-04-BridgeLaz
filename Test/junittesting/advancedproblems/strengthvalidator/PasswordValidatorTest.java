package org.example.Day05.junittesting.advancedproblems.strengthvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"), "Valid password should pass.");
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValid("Ab1"), "Password with less than 8 characters should fail.");
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValid("password1"), "Password without an uppercase letter should fail.");
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValid("Password"), "Password without a digit should fail.");
    }

    @Test
    void testPasswordWithOnlyNumbers() {
        assertFalse(PasswordValidator.isValid("12345678"), "Password with only numbers should fail.");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null), "Null password should fail.");
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""), "Empty password should fail.");
    }
}
