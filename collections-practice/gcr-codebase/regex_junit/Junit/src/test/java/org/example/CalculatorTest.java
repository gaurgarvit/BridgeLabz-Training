package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        // verifying that addition works correctly
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        // checking if subtraction returns the correct difference
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        // testing if multiplication results are accurate
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        // ensuring division logic is correct
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        // asserting that division by zero throws an exception
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}