package com.kodilla.good.patterns.challenges.onlineshop;

public class OrderDto {
    private String product;
    private int quantity;

    public OrderDto(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}