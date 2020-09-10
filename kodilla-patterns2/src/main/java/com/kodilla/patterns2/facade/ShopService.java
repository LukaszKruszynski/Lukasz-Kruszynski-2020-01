package com.kodilla.patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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
            Order order = iterator.next();
            int size = order.getItems().size();
            for (int n = 0; n < size; n++) {
                if (order.getItems().get(n).getProductId().equals(productId)) {
                    order.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            return order.calculateValue();
        }
        return BigDecimal.ZERO;
    }

    public boolean doPayment(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.isPaid()) {
                return true;
            } else {
                Random random = new Random();
                order.setPaid(random.nextBoolean());
                return order.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            boolean paid = order.isPaid();
            Random random = new Random();
            if (!order.isVerified()) {
                order.setVerified(paid && random.nextBoolean());
            }
            return order.isVerified();
        }
        return false;
    }

    public boolean submitOrder(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.isVerified()) {
                order.setSubmitted(true);
            }
            return order.isSubmitted();
        }
        return false;
    }

    public void cancelOrder(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            orders.remove(order);
        }
    }
}
