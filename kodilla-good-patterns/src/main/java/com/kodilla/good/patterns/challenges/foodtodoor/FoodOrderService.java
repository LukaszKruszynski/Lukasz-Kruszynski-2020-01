package com.kodilla.good.patterns.challenges.foodtodoor;

import java.util.Random;

public class FoodOrderService implements OrderService {
    @Override
    public boolean orderIsCompleted(OrderDto orderDto) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
