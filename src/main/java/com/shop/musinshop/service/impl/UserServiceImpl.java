package com.shop.musinshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.musinshop.entity.User;
import com.shop.musinshop.repository.UserRepository;
import com.shop.musinshop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public User getUserByUsername(String username){
        return userRepository.findByAccount_Username(username);
    }
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
