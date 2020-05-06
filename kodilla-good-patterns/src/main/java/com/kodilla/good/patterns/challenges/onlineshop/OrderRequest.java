package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    private Address address;

    public OrderRequest(final User user, final LocalDateTime orderTime, final Address address) {
        this.user = user;
        this.orderTime = orderTime;
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Address getAddress() {
        return address;
    }
}
