package org.example;

public class Account implements Depositable, Withdrawable, Balanceable{

    private double balance;

    public Account() {}

    public Account(double balance) {
        balance = 0;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void setBalance(double amount) {
        balance = amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
