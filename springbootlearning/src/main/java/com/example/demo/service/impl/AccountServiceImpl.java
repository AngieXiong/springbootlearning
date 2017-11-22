package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAccountMapper;
import com.example.demo.entity.Account;
import com.example.demo.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	private IAccountMapper accountDAO;

	@Override
	public int add(Account account) {
		return accountDAO.add(account);
	}

	@Override
	public int update(Account account) {
		return accountDAO.update(account);
	}

	@Override
	public int delete(int id) {
		return accountDAO.delete(id);
	}

	@Override
	public Account getAccountById(Integer id) {
		return accountDAO.getAccountById(id);
	}

	@Override
	public List<Account> getAccounts() {
		return accountDAO.findAccountList();
	}

}
