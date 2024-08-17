package com.bank.transactiondemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.transactiondemo.Entity.Account;
import com.bank.transactiondemo.Repository.AccountRepository;

@SpringBootTest
public class SaveAccount {

	@Autowired
	private AccountRepository accountRepository;
	
	@Test
	public void saveAccount() {
	    Account account1 = new Account();
	    Account account2 = new Account();
	    Account account3 = new Account();
	    
	    account1.setName("Bharath");
	    account1.setLocation("India");
	    account1.setBalance(70000);
	    account1.setAccountNo(5432102L);
	    accountRepository.save(account1);
	    
	    account2.setName("Anandh");
	    account2.setLocation("India");
	    account2.setBalance(50000);
	    account2.setAccountNo(5432104L);  // Use a unique account number
	    accountRepository.save(account2);
	    
	    account3.setName("Sam");
	    account3.setLocation("USA");
	    account3.setBalance(4000);
	    account3.setAccountNo(5432105L);  // Use another unique account number
	    accountRepository.save(account3);
	}
}
