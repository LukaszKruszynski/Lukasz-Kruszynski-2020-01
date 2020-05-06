package com.kodilla.good.patterns.challenges.foodtodoor;

public class ExtraFoodShop implements FoodShop {
    private final FoodOrderService foodOrderService;

    public ExtraFoodShop(final FoodOrderService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

    @Override
    public void process(OrderDto orderDto) {
        String status = foodOrderService.orderIsCompleted(orderDto) ? "completed." : "none completed.";
        System.out.println("Order for Extra Food shop is " + status);
    }
}
