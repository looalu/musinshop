package com.shop.musinshop.service;

import com.shop.musinshop.entity.Role;

public interface RoleService {
    Role getRoleByName(String name);
    Role getRoleByUsername(String username);
}
