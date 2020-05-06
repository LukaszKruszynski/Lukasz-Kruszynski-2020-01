package com.kodilla.good.patterns.challenges.foodtodoor;

public class ShopService {
    private FoodShop foodShop;

    public void process(TypeSupplier typeSupplier, OrderDto orderDto) {
        switch (typeSupplier) {
            case EXTRAFOOD:
                foodShop = new ExtraFoodShop();
                break;
            case HEALTHY:
                foodShop = new HealthyShop();
                break;
            case GLUTEN:
                foodShop = new GlutenFreeShop();
                break;
        }
        foodShop.process(orderDto);
    }
}
