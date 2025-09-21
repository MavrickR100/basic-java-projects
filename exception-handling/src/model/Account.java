package model;

import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

public class Account {
    private final int accountNumber;
    private final String holderName;
    private  double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero!");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance! Current balance: " + balance);
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber +
                ", holder='" + holderName + '\'' +
                ", balance=" + balance + '}';
    }
}

