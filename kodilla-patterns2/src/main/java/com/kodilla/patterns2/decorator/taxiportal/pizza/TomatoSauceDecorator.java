package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;
import java.util.List;

public class TomatoSauceDecorator extends AbstractPizzaOrderDecorator{
    public TomatoSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("tomato dip");
        return ingredients;
    }
}
