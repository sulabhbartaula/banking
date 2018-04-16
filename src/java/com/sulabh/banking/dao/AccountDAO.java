
package com.sulabh.banking.dao;

import com.sulabh.banking.model.Account;
import java.util.List;


public interface AccountDAO {
    
    public boolean saveAccount(Account account);
    
    public List<Account> getAccounts();
    
    public Account getAccount(Integer accountNo);
    
    public boolean deleteAccount(int accountNo);
    
}
