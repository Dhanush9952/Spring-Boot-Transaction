package com.bank.transactiondemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.transactiondemo.Entity.Account;
import com.bank.transactiondemo.Repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public Account saveAccountDetails(Account account) {
		Account acc = accountRepository.save(account);
		return acc;
	}
}
