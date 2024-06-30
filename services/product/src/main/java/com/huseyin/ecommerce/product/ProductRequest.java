package com.huseyin.ecommerce.product;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRequest(
        Integer id,
        @NotNull(message = "Field is required")
        String name,
        @NotNull(message = "Field is required")
        String description,
        @NotNull(message = "Should be positive")
        double availableQuantity,
        @NotNull(message = "Should be positive")
        BigDecimal price,

        @NotNull(message = "Field is required")
        Integer categoryId

) {


}
