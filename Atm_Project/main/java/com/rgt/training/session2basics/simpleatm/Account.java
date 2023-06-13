package com.rgt.training.session2basics.simpleatm;


public class Account {
    private int accountNumber;
    private int PinNumber;
    private double balance;

    public Account(int accountNumber, int pinNumber, double balance) {
        super();
        this.accountNumber = accountNumber;
        PinNumber = pinNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPinNumber() {
        return PinNumber;
    }

    public double getBalance() {
        return balance;
    }
}

