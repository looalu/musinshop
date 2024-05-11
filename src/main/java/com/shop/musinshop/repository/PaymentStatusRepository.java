package com.shop.musinshop.repository;

import com.shop.musinshop.entity.PaymentStatus;
import com.shop.musinshop.enums.PaymentStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Integer> {
    PaymentStatus getPaymentStatusByPaymentStatusEnum(PaymentStatusEnum paymentStatusEnum);
    boolean existsByPaymentStatusEnum(PaymentStatusEnum paymentStatusEnum);
}
