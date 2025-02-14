package org.example.Day04.banktransanctionsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void testMainScenarios() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000);

        Exception insufficientBalanceException1 = assertThrows(InsufficientBalanceException.class,
                () -> account.withdraw(6000),
                "Should throw InsufficientBalanceException due to insufficient balance");
        assertEquals("Insufficient balance!", insufficientBalanceException1.getMessage());

        Exception illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(-100),
                "Should throw IllegalArgumentException due to invalid withdrawal amount");
        assertEquals("Invalid amount!", illegalArgumentException.getMessage());


        account.withdraw(500);
        assertEquals(500, account.getBalance(), "Balance should be updated after successful withdrawal");
    }

}