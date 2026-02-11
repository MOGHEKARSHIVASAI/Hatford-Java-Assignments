package org.example;

abstract class Bank {
    protected String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    abstract void displayBankInfo();
}
