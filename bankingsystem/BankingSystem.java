package org.example.Day02.bankingsystem;

import java.util.*;

class BankingSystem {

    protected HashMap<String, Double> customerAccounts = new HashMap<>();
    protected TreeMap<Double, List<String>> sortedByBalance = new TreeMap<>(Collections.reverseOrder());
    protected Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double balance) {
        customerAccounts.put(accountNumber, balance);
        sortedByBalance.computeIfAbsent(balance, k -> new ArrayList<>()).add(accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        double newBalance = customerAccounts.getOrDefault(accountNumber, 0.0) + amount;
        customerAccounts.put(accountNumber, newBalance);
        sortedByBalance.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    public void withdraw(String accountNumber, double amount) {
        withdrawalQueue.add(accountNumber);
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            double balance = customerAccounts.getOrDefault(accountNumber, 0.0);
            if (balance > 0) {
                customerAccounts.put(accountNumber, balance - 1); // Withdrawal logic
                System.out.println(" Withdrawal processed for account " + accountNumber);
            }
        }
    }

    public void displaySortedAccountsByBalance() {
        for (Map.Entry<Double, List<String>> entry : sortedByBalance.entrySet()) {
            System.out.println("Balance in INR : " + entry.getKey() + " - Account Numbers : " + entry.getValue());
        }
    }
}
