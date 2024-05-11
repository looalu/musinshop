package com.shop.musinshop.repository;

import com.shop.musinshop.entity.PaymentMethod;
import com.shop.musinshop.enums.PaymentMethodEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
    PaymentMethod getPaymentMethodByPaymentMethodEnum(PaymentMethodEnum paymentMethodEnum);
    boolean existsByPaymentMethodEnum(PaymentMethodEnum paymentMethodEnum);
}
