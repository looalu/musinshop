package com.shop.musinshop.service;

import java.util.List;
import java.util.Optional;
import com.shop.musinshop.dto.CartItemDTO;
import com.shop.musinshop.dto.CartItemRequest;
import com.shop.musinshop.dto.UpdateCartItemRequest;
import com.shop.musinshop.entity.Cart;
import com.shop.musinshop.entity.CartItem;

public interface CartService {
    Cart getCartByUsername(String username);
    List<CartItem> getCartItemsByUsername(String username);

    void addCartItemToCart(String username, CartItemRequest cartItemRequest);

    void updateCartItemQuantity(String username, Integer cartItemId, Integer quantity);

    void createCartForUser(String username);

    boolean availableQuantity(Integer quantityRequest, Integer quantityAvailable);

    void handleAddCartItemToCart(String username, CartItemRequest cartItemRequest);

    void handleUpdateCartItemQuantity(String username, UpdateCartItemRequest updateCartItemRequest);

    void deleteCartItem(Integer id, String username);
}
