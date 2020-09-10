package com.kodilla.patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();
    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService service;

    public Long openOrder(Long userId) {
        if (authenticator.isAuthenticated(userId)) {
            Long maxOrder = (long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(service, userId, maxOrder + 1));
            return maxOrder + 1;
        } else {
            return -1L;
        }
    }

    public void addItem(Long productId, Long orderId, double qty) {
        orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .forEach(o -> o.getItems().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId, Long productId) {
        Iterator<Order> iterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order next = iterator.next();
            int size = next.getItems().size();
            for (int n = 0; n < size; n++) {
                if(next.getItems().get(n).getProductId().equals(productId)) {
                    next.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue(){


    }
}
