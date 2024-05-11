package com.shop.musinshop.converter;


import com.shop.musinshop.dto.CartItemDTO;
import com.shop.musinshop.dto.ItemDTO;
import com.shop.musinshop.dto.OrderResponseDTO;
import com.shop.musinshop.entity.CartItem;
import com.shop.musinshop.entity.Image;
import com.shop.musinshop.entity.Item;
import com.shop.musinshop.entity.Order;
import com.shop.musinshop.service.BrandService;
import com.shop.musinshop.service.CategoryService;
import com.shop.musinshop.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Lazy
public class Converter {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ImageService imageService;



    public ItemDTO toItemDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(item.getId());
        itemDTO.setName(item.getName());
        itemDTO.setPrice(item.getPrice());
        itemDTO.setDescription(item.getDescription());
        itemDTO.setBrandName(item.getBrand().getName());
        itemDTO.setCategoryName(item.getCategory().getName());
        itemDTO.setImages(imageService.getAllByItemId(item.getId()));
        itemDTO.setInventoryQuantity(item.getInventoryQuantity());
        return itemDTO;
    }


    public CartItemDTO toCartItemDTO(CartItem cartItem) {
        CartItemDTO cartItemDTO = new CartItemDTO();
        cartItemDTO.setId(cartItem.getId());
        cartItemDTO.setItemId(cartItem.getId());
        Optional<Image> imageOptional = imageService.getFirstByItemId(cartItem.getItem().getId());
        if (imageOptional.isPresent()) {
            cartItemDTO.setItemImage(imageOptional.get().getImageUrl());
        } else {

            cartItemDTO.setItemImage(null);
        }

		cartItemDTO.setItemImage(imageService.getFirstByItemId(cartItem.getItem().getId())
																.get()
																.getImageUrl());
        cartItemDTO.setNameItem(cartItem.getItem().getName());
        cartItemDTO.setQuantity(cartItem.getQuantity());
        cartItemDTO.setUnitPrice(cartItem.getItem().getPrice());
        cartItemDTO.setTotalPrice(cartItem.getQuantity() * cartItem.getItem().getPrice());

        return cartItemDTO;
    }


    public OrderResponseDTO toOrderResponseDTO(Order order) {

        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setId(order.getId());
        orderResponseDTO.setCustomerName(order.getCustomerName());
        orderResponseDTO.setCustomerPhone(order.getCustomerPhone());
        orderResponseDTO.setAddress(order.getAddress());
        orderResponseDTO.setOrderDate(order.getOrderDate());
        orderResponseDTO.setTotalAmount(order.getTotalAmount());
        orderResponseDTO.setPaymentMethod(order.getPaymentMethod().getPaymentMethodEnum());
        orderResponseDTO.setPaymentStatus(order.getPaymentStatus().getPaymentStatusEnum());
        orderResponseDTO.setOrderStatus(order.getOrderStatus().getOrderStatusEnum());
        orderResponseDTO.setDetailItemOrders(order.getDetailItemOrders());
        return orderResponseDTO;
    }

}
