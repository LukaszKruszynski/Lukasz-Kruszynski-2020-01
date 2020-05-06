package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public interface OrderService {
    static boolean order(User user, LocalDateTime orderTime, Address address) {
        return true;
    }
}
