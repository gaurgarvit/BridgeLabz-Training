package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        // verifying a password that meets all requirements
        assertTrue(validator.isValid("StrongPass1"));
    }

    @Test
    void testTooShort() {
        // checking a password with less than 8 characters
        assertFalse(validator.isValid("Short1A"));
    }

    @Test
    void testNoUppercase() {
        // ensuring failure when uppercase letter is missing
        assertFalse(validator.isValid("weakpass1"));
    }

    @Test
    void testNoDigit() {
        // ensuring failure when digit is missing
        assertFalse(validator.isValid("NoDigitPass"));
    }

    @Test
    void testNullInput() {
        // handling null input gracefully
        assertFalse(validator.isValid(null));
    }
}