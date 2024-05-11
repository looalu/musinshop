package com.shop.musinshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.musinshop.entity.Account;
import com.shop.musinshop.repository.AccountRepository;
import com.shop.musinshop.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public boolean existsByUsername(String username) {
        return accountRepository.existsByUsername(username);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
