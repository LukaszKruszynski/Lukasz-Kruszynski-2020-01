package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;
import java.util.List;

public class ChickenDecorator extends AbstractPizzaOrderDecorator{
    public ChickenDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7.5));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("chicken");
        return ingredients;
    }
}
