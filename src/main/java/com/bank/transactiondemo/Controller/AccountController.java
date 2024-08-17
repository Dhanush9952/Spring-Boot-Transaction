package com.bank.transactiondemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.transactiondemo.Entity.Account;
import com.bank.transactiondemo.Service.AccountService;

@RestController
@RequestMapping("/bank")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
//	@PostMapping("/saveAccount")
//	public Account saveAccount(@RequestBody Account account) {
//		Account acc = accountService.saveAccountDetails(account);
//		return acc;
//	}
	
	@PostMapping("/saveAccount")
	public Account saveAccount(@RequestBody Account account) {
	    return accountService.saveAccountDetails(account);
}
}