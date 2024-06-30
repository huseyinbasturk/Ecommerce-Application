package com.huseyin.ecommerce.payment;

import com.huseyin.ecommerce.customer.CustomerResponse;
import com.huseyin.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
