package com.huseyin.ecommerce.kafka;

import com.huseyin.ecommerce.customer.CustomerResponse;
import com.huseyin.ecommerce.order.PaymentMethod;
import com.huseyin.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
