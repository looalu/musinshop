package com.shop.musinshop.repository;
import com.shop.musinshop.entity.OrderStatus;
import com.shop.musinshop.enums.OrderStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
    OrderStatus getOrderStatusByOrderStatusEnum(OrderStatusEnum orderStatusEnum);
    boolean existsByOrderStatusEnum(OrderStatusEnum orderStatusEnum);
}
