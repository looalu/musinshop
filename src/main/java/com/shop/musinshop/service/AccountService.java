package com.shop.musinshop.service;

import com.shop.musinshop.entity.Account;

public interface AccountService {
    boolean existsByUsername(String username);
    Account save(Account account);
}
