package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;
import java.util.List;

public class DoubleMozzarellaDecorator extends AbstractPizzaOrderDecorator{
    public DoubleMozzarellaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("double mozzarella");
        return ingredients;
    }
}
