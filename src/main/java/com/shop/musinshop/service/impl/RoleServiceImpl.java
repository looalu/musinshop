package com.shop.musinshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.musinshop.entity.Role;
import com.shop.musinshop.repository.RoleRepository;
import com.shop.musinshop.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Role getRoleByUsername(String username) {
        return roleRepository.findByUsername(username);
    }
}
