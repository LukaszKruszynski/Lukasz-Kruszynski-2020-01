package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public List<String> getIngredients() {
        return pizzaOrder.getIngredients();
    }
}
