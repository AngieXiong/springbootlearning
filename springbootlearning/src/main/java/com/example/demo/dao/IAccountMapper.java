package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Account;

public interface IAccountMapper {
	
	int add(Account account);
	
	int update(Account account);

	int delete(Integer id);
	
	Account getAccountById(Integer id);

	List<Account> findAccountList();
}
