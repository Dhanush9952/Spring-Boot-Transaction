package com.bank.transactiondemo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String str) {
		super(str);
	}
}