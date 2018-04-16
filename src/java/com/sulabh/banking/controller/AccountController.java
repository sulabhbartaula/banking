/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulabh.banking.controller;

import com.sulabh.banking.model.Account;
import com.sulabh.banking.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class AccountController {
    
    @Autowired
    AccountService accountService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String showHomePage(){
        return "index";
    }
    
    @RequestMapping("/new")
    public String createNewAccount(Model model){
        model.addAttribute("account", new Account());
        return "account-form";
    }
    
    @RequestMapping(value="/saveAccount")
    public String saveAccount(Account account,Model model){
        boolean flag = accountService.saveAccount(account);
        System.out.println(flag);
        return "redirect: /list";
    }
    
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String listAccounts(Model model){
        List<Account> accounts = accountService.getAccounts();
        model.addAttribute("accounts",accounts);
        
        return "listAccounts";   
    }
    
    @RequestMapping(value="/edit",method=RequestMethod.GET)
    public String updateAccount(
            @RequestParam("accountNo") int accountNo,Model model){
        
        Account account = accountService.getAccount(new Integer(accountNo));
        model.addAttribute("account", account);
        return "account-form";
    }
    
    @RequestMapping(value="/delete",method=RequestMethod.GET)
    public String deleteAccount(
            @RequestParam("accountNo") int accountNo,Model model){
        
        boolean deleteFlag = accountService.deleteAccount(accountNo);
        
        return "redirect:/list";
    }
    
    
    @RequestMapping(value="*")
    public String pagenotfound(){
        return "pagenotfound";
    }
    
}
