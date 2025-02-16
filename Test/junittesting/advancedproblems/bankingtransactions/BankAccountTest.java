package org.example.Day05.junittesting.advancedproblems.bankingtransactions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initial balance is 100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated after deposit.");
    }

    @Test
    void testWithdrawSuccessful() {
        boolean result = account.withdraw(40.0);
        assertTrue(result, "Withdrawal should be successful.");
        assertEquals(60.0, account.getBalance(), "Balance should be reduced after withdrawal.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        boolean result = account.withdraw(150.0);
        assertFalse(result, "Withdrawal should fail if insufficient funds.");
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged.");
    }

    @Test
    void testDepositNegativeAmount() {
        account.deposit(-20.0);
        assertEquals(100.0, account.getBalance(), "Negative deposit should not change balance.");
    }

    @Test
    void testWithdrawNegativeAmount() {
        boolean result = account.withdraw(-30.0);
        assertFalse(result, "Withdrawal of negative amount should fail.");
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged.");
    }
}
