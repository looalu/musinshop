package com.shop.musinshop.utils;

import com.shop.musinshop.enums.PaymentMethodEnum;
import com.shop.musinshop.enums.PaymentStatusEnum;

public class MapJsonEnum {
    public static PaymentMethodEnum mapPaymentMethod(String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "cash":
                return PaymentMethodEnum.CASH;
            case "vnpay":
                return PaymentMethodEnum.VNPAY;
            case "momo":
                return PaymentMethodEnum.MOMO;
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }

    public static PaymentStatusEnum mapPaymentStatus(String paymentStatus) {
        switch (paymentStatus.toLowerCase()) {
            case "failed":
                return PaymentStatusEnum.FAILED;
            case "pending":
                return PaymentStatusEnum.PENDING;
            case "paid":
                return PaymentStatusEnum.PAID;
            case "cancelled":
                return PaymentStatusEnum.CANCELLED;
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentStatus);
        }
    }
}
