package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;
import java.util.List;

public interface PizzaOrder {
    BigDecimal getCost();
    List<String> getIngredients();
}
