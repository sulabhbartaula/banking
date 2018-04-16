
package com.sulabh.banking.service;

import com.sulabh.banking.dao.AccountDAO;
import com.sulabh.banking.model.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class AccountServiceImpl implements AccountService {
    
    @Autowired
    AccountDAO accountDAO;

    @Override
    public boolean saveAccount(Account account) {
        return accountDAO.saveAccount(account);
    }

    @Override
    public List<Account> getAccounts() {
        return accountDAO.getAccounts();
    }

    @Override
    public Account getAccount(Integer accountNo) {
        return accountDAO.getAccount(accountNo);
    }

    @Override
    public boolean deleteAccount(int accountNo) {
        return accountDAO.deleteAccount(accountNo);
    }
    
}
