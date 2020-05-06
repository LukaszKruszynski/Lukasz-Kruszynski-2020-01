package com.kodilla.good.patterns.challenges.foodtodoor;

public class HealthyShop implements FoodShop {

    private final FoodOrderService foodOrderService;

    public HealthyShop(FoodOrderService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

    @Override
    public void process(OrderDto orderDto) {
        String status = foodOrderService.orderIsCompleted(orderDto) ? "completed." : "none completed.";
        System.out.println("Order for Healthy shop is " + status);
    }
}
