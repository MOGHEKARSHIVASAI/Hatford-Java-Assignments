package org.example;

class Account {
    private int accountNumber;
    private String childName;
    private double balance;

    public Account(int accountNumber, String childName, double balance) {
        this.accountNumber = accountNumber;
        this.childName = childName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getChildName() {
        return childName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Child Name: " + childName);
        System.out.println("Balance: ₹" + balance);
    }
}
