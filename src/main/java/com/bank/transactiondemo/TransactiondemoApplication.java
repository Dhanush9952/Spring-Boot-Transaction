package com.bank.transactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@EnableTransactionManagement 
public class TransactiondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactiondemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
