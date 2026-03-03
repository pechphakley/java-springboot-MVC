package co.istad.a01a1afternoon.dto;

import org.apache.catalina.util.Strftime;

import java.math.BigDecimal;

public record CreateProductReques(
        String name,
        BigDecimal price
) {
}
