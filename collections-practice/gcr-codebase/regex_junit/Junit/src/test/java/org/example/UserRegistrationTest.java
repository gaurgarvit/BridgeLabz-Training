package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        // ensuring valid inputs do not throw any exceptions
        assertDoesNotThrow(() -> registration.registerUser("john_doe", "john@example.com", "securePass123"));
    }

    @Test
    void testNullUsername() {
        // expecting exception when username is missing
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser(null, "john@example.com", "pass"));
    }

    @Test
    void testEmptyEmail() {
        // verifying that empty email triggers an error
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("john", "", "pass"));
    }

    @Test
    void testNullPassword() {
        // checking failure on null password
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("john", "john@test.com", null));
    }
}