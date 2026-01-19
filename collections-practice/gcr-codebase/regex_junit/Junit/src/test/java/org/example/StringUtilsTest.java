package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        // reversing a standard string
        assertEquals("avaJ", utils.reverse("Java"));
    }

    @Test
    void testIsPalindrome() {
        // checking a valid palindrome
        assertTrue(utils.isPalindrome("madam"));
        // checking a non-palindrome string
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        // converting lowercase string to uppercase
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }
}