package com.kodilla.good.patterns.challenges.foodtodoor;

public class Application {
    public static void main(String[] args) {
        ShopRequest shopRequest = new ShopRequest();
        OrderDto prepare = shopRequest.prepare();
    }
}
