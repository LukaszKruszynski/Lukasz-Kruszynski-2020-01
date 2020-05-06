package com.kodilla.good.patterns.challenges.foodtodoor;

public class GlutenFreeShop implements FoodShop {
    private FoodOrderService foodOrderService;

    public GlutenFreeShop(final FoodOrderService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

    @Override
    public void process(OrderDto orderDto) {
        String status = foodOrderService.orderIsCompleted(orderDto) ? "completed." : "none completed.";
        System.out.println("Order for GlutenFree shop is " + status);
    }
}
