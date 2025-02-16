package org.example.Day05.junittesting.advancedproblems.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private final UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("JohnDoe", "johndoe@example.com", "securePass"));
    }

    @Test
    void testUsernameCannotBeEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("", "johndoe@example.com", "securePass"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testEmailCannotBeInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("JohnDoe", "invalid-email", "securePass"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testPasswordMustBeAtLeast6Characters() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("JohnDoe", "johndoe@example.com", "123"));
        assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }
}
