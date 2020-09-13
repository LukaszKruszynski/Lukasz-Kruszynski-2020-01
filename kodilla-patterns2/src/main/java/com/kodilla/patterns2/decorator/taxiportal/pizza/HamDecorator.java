package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;
import java.util.List;

public class HamDecorator extends AbstractPizzaOrderDecorator {
    public HamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("ham");
        return ingredients;
    }
}
