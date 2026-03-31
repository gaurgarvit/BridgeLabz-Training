package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testBanking() {
        BankAccount account = new BankAccount();

        // depositing money into the account
        account.deposit(100);
        assertEquals(100, account.getBalance());

        // withdrawing a valid amount
        account.withdraw(50);
        assertEquals(50, account.getBalance());

        // verifying exception is thrown on overdraw
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
    }
}