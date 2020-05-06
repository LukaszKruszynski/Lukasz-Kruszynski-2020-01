package com.kodilla.good.patterns.challenges.foodtodoor;

public class Application {
    public static void main(String[] args) {
        ShopRequest shopRequest = new ShopRequest();
        ShopService shopService = new ShopService();
        OrderDto prepare = shopRequest.prepare();
        shopService.process(TypeSupplier.GLUTEN,prepare);

    }
}
