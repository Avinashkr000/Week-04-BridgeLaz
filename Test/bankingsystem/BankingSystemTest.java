package org.example.Day02.bankingsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {

    @Test
    void createAccount() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.createAccount("12345", 500.0);
        assertEquals(500.0, bankingSystem.customerAccounts.get("12345"));
    }

    @Test
    void deposit() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.createAccount("12345", 500.0);
        bankingSystem.deposit("12345", 200.0);
        assertEquals(700.0, bankingSystem.customerAccounts.get("12345"));
    }

    @Test
    void withdraw() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.createAccount("12345", 500.0);
        bankingSystem.withdraw("12345", 100.0);
        assertFalse(bankingSystem.withdrawalQueue.isEmpty());
        assertEquals("12345", bankingSystem.withdrawalQueue.peek());
    }

    @Test
    void processWithdrawals() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.createAccount("12345", 500.0);
        bankingSystem.withdraw("12345", 100.0);
        bankingSystem.processWithdrawals();
        assertEquals(499.0, bankingSystem.customerAccounts.get("12345"));
        assertTrue(bankingSystem.withdrawalQueue.isEmpty());
    }

    @Test
    void displaySortedAccountsByBalance() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.createAccount("12345", 500.0);
        bankingSystem.createAccount("67890", 1000.0);
        bankingSystem.displaySortedAccountsByBalance();

    }
}