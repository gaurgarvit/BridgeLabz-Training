package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathOpsTest {

    private final MathOps ops = new MathOps();

    @Test
    void testDivideException() {
        // verifying that arithmetic exception is thrown correctly
        assertThrows(ArithmeticException.class, () -> ops.divide(10, 0));
    }
}