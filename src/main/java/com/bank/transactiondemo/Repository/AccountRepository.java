package com.bank.transactiondemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.transactiondemo.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	Account findByAccountNo(Long accountNo);
}
