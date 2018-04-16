package com.sulabh.banking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class AccountEntity {
    
    @Id
    @Column(name="accNo")
    int accountNumber;
    
    @Column(name="accHolderName")
    String accountHolderName;
    
    @Column(name="balance")
    int balance;

    public AccountEntity() {
    }

    public AccountEntity(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountEntity{" + "accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance=" + balance + '}';
    }
    
}
