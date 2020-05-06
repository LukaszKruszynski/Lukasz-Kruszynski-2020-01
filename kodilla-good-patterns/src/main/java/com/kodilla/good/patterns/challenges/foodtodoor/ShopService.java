package com.kodilla.good.patterns.challenges.foodtodoor;

public class ShopService {
    private FoodShop foodShop;

    public void process(TypeSupplier typeSupplier, OrderDto orderDto) {
        switch (typeSupplier) {
            case EXTRAFOOD:
                foodShop = new ExtraFoodShop(new FoodOrderService());
                break;
            case HEALTHY:
                foodShop = new HealthyShop(new FoodOrderService());
                break;
            case GLUTEN:
                foodShop = new GlutenFreeShop(new FoodOrderService());
                break;
        }
        foodShop.process(orderDto);
    }
}
