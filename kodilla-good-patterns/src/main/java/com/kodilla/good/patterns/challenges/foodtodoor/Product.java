package com.kodilla.good.patterns.challenges.foodtodoor;

public class Product {
    String productName;
    int count;

    public Product(String productName, int count) {
        this.productName = productName;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public int getCount() {
        return count;
    }
}
