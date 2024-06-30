package com.huseyin.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull(message = "Mandatory")
        Integer productId,
        @NotNull(message = "Mandatory")
        double quantity
) {


}
