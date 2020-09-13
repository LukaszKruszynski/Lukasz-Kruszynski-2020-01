package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MargheritaPizza implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("dough");
        ingredients.add("tomato sauce");
        ingredients.add("mozzarella");
        return ingredients;
    }
}
