package com.kodilla.good.patterns.challenges.onlineshop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface OrderRepository {
    default void createOrder(User user, LocalDateTime orderTime, Address address) {
        System.out.println("Order has been added to database");
    }
}
