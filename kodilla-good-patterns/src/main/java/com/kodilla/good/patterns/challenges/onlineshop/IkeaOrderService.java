package com.kodilla.good.patterns.challenges.onlineshop;

import java.util.Random;

public class IkeaOrderService implements OrderService {
    @Override
    public boolean order(OrderDto orderDto, User user) {
        System.out.println("Ordering:" + orderDto);
        Random random = new Random();
        return random.nextBoolean();
    }
}
