package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;
import java.util.List;

public interface PizzaOrder {
    BigDecimal getCost();
    List<String> getIngredients();
}
