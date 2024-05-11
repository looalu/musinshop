package com.shop.musinshop.service.impl;

import java.util.List;
import java.util.Optional;

import com.shop.musinshop.entity.CartItem;
import com.shop.musinshop.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.musinshop.converter.Converter;
import com.shop.musinshop.dto.CartItemDTO;
import com.shop.musinshop.repository.CartItemRepository;
import com.shop.musinshop.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    CartItemRepository cartItemRepository;
    @Autowired(required = false)
    Converter converter;

    @Override
    public List<CartItemDTO> findCartItemsByCartId(Integer cartId) {
        return cartItemRepository.findByCartId(cartId).stream().map(c -> converter.toCartItemDTO(c)).toList();
    }


    @Override
    public Item getItemByCartItemId(Integer id) {
        return cartItemRepository.getItemByCartItemId(id);
    }

    @Override

    public CartItem getCartItemById(Integer id) {
        Optional<CartItem> cartItemOpt = cartItemRepository.findById(id);
        return cartItemOpt.orElse(null);
    }

    @Override
    public boolean existById(Integer id) {
        return cartItemRepository.existsById(id);
    }

    @Override
    public void deleteById(Integer id) {
        cartItemRepository.deleteById(id);
    }

    @Override
    public void save(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

}
