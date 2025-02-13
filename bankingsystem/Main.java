package org.example.Day02.bankingsystem;


public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        bankingSystem.createAccount("0001", 55000.0);
        bankingSystem.createAccount("0002", 35000.0);
        bankingSystem.createAccount("0003", 8200.0);

        bankingSystem.deposit("0001", 2000.0);
        bankingSystem.deposit("0002", 1500.0);

        bankingSystem.withdraw("0001", 1000.0);

        System.out.println("Accounts Sorted by Balance :");
        bankingSystem.displaySortedAccountsByBalance();

        bankingSystem.processWithdrawals();
    }
}
