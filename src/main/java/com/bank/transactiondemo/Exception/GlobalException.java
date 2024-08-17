package com.bank.transactiondemo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<ErrorDetails> InsufficientBalance(InsufficientBalanceException balance, WebRequest webRequest){
		ErrorDetails ed = new ErrorDetails(new Date(), balance.getMessage(), webRequest.getDescription(true));
		return new ResponseEntity<>(ed, HttpStatus.NOT_FOUND);
	}
}
