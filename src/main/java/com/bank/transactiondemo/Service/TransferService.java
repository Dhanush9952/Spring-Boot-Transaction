package com.bank.transactiondemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.transactiondemo.Exception.InsufficientBalanceException;
import com.bank.transactiondemo.Entity.Account;
import com.bank.transactiondemo.Repository.AccountRepository;

@Service
public class TransferService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public String transferAmount(Long fromAccountNo, Long toAccountNo, double transferAmount) {
        // Retrieve the source account
        Account fromAccount = accountRepository.findByAccountNo(fromAccountNo);
        // Retrieve the destination account
        Account toAccount = accountRepository.findByAccountNo(toAccountNo);
        
        // Check if both accounts exist
        if (fromAccount == null || toAccount == null) {
            throw new IllegalArgumentException("One of the accounts does not exist.");
        }

        // Check if the source account has sufficient balance
        if (fromAccount.getBalance() < transferAmount) {
            throw new InsufficientBalanceException("Insufficient balance in the "+ fromAccount.getName() +" account.");
        }

        // Perform the transfer
        fromAccount.setBalance(fromAccount.getBalance() - transferAmount);
        toAccount.setBalance(toAccount.getBalance() + transferAmount);

        // Save the updated account information
        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);
        
        return "Transfer Successful!";
    }
}
