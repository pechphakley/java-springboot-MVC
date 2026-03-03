package co.istad.a01a1afternoon.dto;

import java.math.BigDecimal;

public record CreateProductRequest(
        String name,
        BigDecimal price
) {
}
