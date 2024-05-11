package com.shop.musinshop.service;

import java.util.List;
import com.shop.musinshop.dto.CartItemDTO;
import com.shop.musinshop.entity.CartItem;
import com.shop.musinshop.entity.Item;

public interface CartItemService {
    List<CartItemDTO> findCartItemsByCartId(Integer cartId);

    Item getItemByCartItemId(Integer id);
    CartItem getCartItemById(Integer id);

    boolean existById(Integer id);
    void deleteById(Integer id);

    void save(CartItem cartItem);

}
