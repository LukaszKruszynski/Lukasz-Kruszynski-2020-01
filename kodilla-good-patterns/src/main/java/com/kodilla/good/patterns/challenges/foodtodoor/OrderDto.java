package com.kodilla.good.patterns.challenges.foodtodoor;

public class OrderDto {
    Product product;
    Supplier supplier;

    public OrderDto(Product product, Supplier supplier) {
        this.product = product;
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
