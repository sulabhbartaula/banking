/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulabh.banking.service;

import com.sulabh.banking.model.Account;
import java.util.List;


public interface AccountService {
    
    public boolean saveAccount(Account account);
    public List<Account> getAccounts();
    public Account getAccount(Integer accountNo);
    public boolean deleteAccount(int accountNo);
    
}
