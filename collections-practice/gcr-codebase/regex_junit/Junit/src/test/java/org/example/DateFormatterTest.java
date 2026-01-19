package org.example;

import org.junit.jupiter.api.Test;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        // converting a standard iso date format
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
    }

    @Test
    void testInvalidDateFormat() {
        // asserting that invalid format throws parsing exception
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("25-12-2023"));
    }

    @Test
    void testInvalidDateLogic() {
        // checking that non-existent dates (like month 13) cause errors
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("2023-13-01"));
    }
}