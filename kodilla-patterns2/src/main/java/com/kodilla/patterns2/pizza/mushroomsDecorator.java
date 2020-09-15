package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;
import java.util.List;

public class mushroomsDecorator extends AbstractPizzaOrderDecorator{

    public mushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.5));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("mushrooms");
        return ingredients;
    }
}
