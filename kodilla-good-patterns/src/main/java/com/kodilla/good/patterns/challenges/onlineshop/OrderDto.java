package com.kodilla.good.patterns.challenges.onlineshop;

public class OrderDto {
    public User user;
    public boolean isAvailable;

    public OrderDto(final User user, final boolean isAvailable) {
        this.user = user;
        this.isAvailable = isAvailable;
    }

    public User getUser() {
        return user;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
