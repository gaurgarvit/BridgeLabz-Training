package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    private final NumberChecker checker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testIsEven(int number) {
        // checking if provided number is even
        assertTrue(checker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsOdd(int number) {
        // ensuring odd numbers return false
        assertFalse(checker.isEven(number));
    }
}