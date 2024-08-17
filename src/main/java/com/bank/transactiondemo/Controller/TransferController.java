package com.bank.transactiondemo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.transactiondemo.Service.TransferService;

@RestController
@RequestMapping("/bank")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PutMapping("/transfer")
    public String transfer(@RequestParam Long fromAccount,@RequestParam Long toAccount,@RequestParam double transferAmount) 
    {
            return transferService.transferAmount(fromAccount, toAccount, transferAmount);
    }
}
