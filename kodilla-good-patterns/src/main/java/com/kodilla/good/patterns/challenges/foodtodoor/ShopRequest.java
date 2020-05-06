package com.kodilla.good.patterns.challenges.foodtodoor;

public class ShopRequest {
    public OrderDto prepare() {
        Product carrot = new Product("Carrot", 10);
        Supplier extraFoodShop = new Supplier("Extra food shop");
        return new OrderDto(carrot, extraFoodShop);
    }
}


