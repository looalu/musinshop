package com.shop.musinshop.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.shop.musinshop.entity.User;

public interface UserService{
    User save(User user);
    User getUserByUsername(String username);
}
