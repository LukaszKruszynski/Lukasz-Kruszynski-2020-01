package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;
import java.util.List;

public class OnionDecorator extends AbstractPizzaOrderDecorator {
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("onion");
        return ingredients;
    }
}
