
package com.sulabh.banking.dao;

import com.sulabh.banking.entity.AccountEntity;
import com.sulabh.banking.model.Account;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveAccount(Account account) {
        boolean saveFlag = true;
        
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccountNumber(account.getAccountNumber());
        accountEntity.setAccountHolderName(account.getAccountHolderName());
        accountEntity.setBalance(account.getBalance());
        
        try{
            Session currentSession = sessionFactory.openSession();
            Transaction trans = currentSession.beginTransaction();
            
            currentSession.saveOrUpdate(accountEntity);
            trans.commit();
             
        }
        catch(Exception ex){
            ex.printStackTrace();
            saveFlag=false;
        }
        
        return saveFlag;
    }

    @Override
    public List<Account> getAccounts() {
        
        List<Account> list = new ArrayList<Account>();
        
        try{
            
            Session session = sessionFactory.openSession();
            Query query = session.createQuery("From AccountEntity");
            List<AccountEntity> accounts = query.list();
            
            for(int i=0;i<accounts.size();i++){
                
                AccountEntity ae = (AccountEntity)accounts.get(i);
                
                Account account = new Account();
                
                account.setAccountNumber(ae.getAccountNumber());
                account.setAccountHolderName(ae.getAccountHolderName());
                account.setBalance(ae.getBalance());
                
                list.add(account);
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return list;
    }

    @Override
    public Account getAccount(Integer accountNo) {
        Account account = new Account();
        try{
            Session session = sessionFactory.openSession();
            AccountEntity ae = (AccountEntity)session.get(AccountEntity.class, accountNo);
            System.out.println(ae);
            
            account.setAccountNumber(ae.getAccountNumber());
            account.setAccountHolderName(ae.getAccountHolderName());
            account.setBalance(ae.getBalance());
                    
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
            return account;
    }

    @Override
    public boolean deleteAccount(int accountNo) {
        
        boolean deleteFlag = true;
        try{
            Session session = sessionFactory.openSession();
            Transaction trans = session.beginTransaction();
            AccountEntity ae = (AccountEntity)session.get(AccountEntity.class,accountNo);
            session.delete(ae);
            trans.commit();
        }catch(Exception ex){
            ex.printStackTrace();
            deleteFlag = false;
        }
        
        return deleteFlag;
    }
    
    
}
