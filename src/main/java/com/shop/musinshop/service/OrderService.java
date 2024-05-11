package com.shop.musinshop.service;

import com.shop.musinshop.dto.OrderRequestDTO;
import com.shop.musinshop.dto.OrderResponseDTO;
import com.shop.musinshop.entity.DetailItemOrder;
import com.shop.musinshop.entity.Order;
import com.shop.musinshop.entity.OrderStatus;
import com.shop.musinshop.enums.OrderStatusEnum;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService {

    List<Order> getOrdersByUsername(String username);
    List<Order> getAll();

    Order save(Order order);

    BigDecimal calcTotalAmount(List<DetailItemOrder> detailItemOrder);

    Order addNewOrder(String username, OrderRequestDTO orderRequestDTO);

    void userCancelOrder(Integer id, String username);

    void updateOrderStatus(Integer orderId, String newStatus);

    OrderStatus getOrderStatusByEnum(OrderStatusEnum orderStatusEnum);

}
