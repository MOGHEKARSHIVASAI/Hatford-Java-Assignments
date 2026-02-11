package org.example;

import java.util.ArrayList;

class ChildrenBank extends Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public ChildrenBank(String bankName) {
        super(bankName);
    }

    @Override
    void displayBankInfo() {
        System.out.println("Welcome to " + bankName);
        System.out.println("Special Bank for Children!");
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account Created Successfully!");
    }

    public Account findAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.displayAccount();
            System.out.println("-------");
        }
    }
}
