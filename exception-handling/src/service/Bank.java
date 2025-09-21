package service;

import exception.AccountNotFoundException;
import exception.InvalidAmountException;
import model.Account;

import java.util.*;

public class Bank {
    private final Map<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int accNo, String name, double initialBalance) throws InvalidAmountException {
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative!");
        }
        accounts.put(accNo, new Account(accNo, name, initialBalance));
    }

    public Account getAccount(int accNo) throws AccountNotFoundException {
        if (!accounts.containsKey(accNo)) {
            throw new AccountNotFoundException("Account number " + accNo + " not found!");
        }
        return accounts.get(accNo);
    }
}

