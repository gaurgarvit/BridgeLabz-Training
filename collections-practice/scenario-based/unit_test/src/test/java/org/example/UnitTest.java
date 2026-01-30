package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    void testDepositValidAmount() {
        Program account = new Program(100);
        account.deposit(50);

        assertEquals(150, account.balance);
    }

    @Test
    void testDepositNegativeAmount() {
        Program account = new Program(100);

        Exception ex = assertThrows(RuntimeException.class,
                () -> account.deposit(-20));

        assertEquals("Deposit amount cannot be negative", ex.getMessage());
    }

    @Test
    void testWithdrawValidAmount() {
        Program account = new Program(200);
        account.withdraw(50);

        assertEquals(150, account.balance);
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Program account = new Program(100);

        Exception ex = assertThrows(RuntimeException.class,
                () -> account.withdraw(150));

        assertEquals("Insufficient funds.", ex.getMessage());
    }
}
