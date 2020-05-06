package com.kodilla.good.patterns.challenges.onlineshop;

public class DataBaseRepository implements OrderRepository {
    @Override
    public void saveOrder(OrderDto orderDto) {
        System.out.println("Saving order: " + orderDto);
    }
}
