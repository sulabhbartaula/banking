package com.sulabh.banking.model;

public class Account {
    
    Integer accountNumber;
    String accountHolderName;
    Integer balance;

    public Account() {
        this.accountNumber = 0;
        this.accountHolderName = "";
        this.balance = 1000;
    }

    public Account(Integer accountNumber, String accountHolderName, Integer balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
