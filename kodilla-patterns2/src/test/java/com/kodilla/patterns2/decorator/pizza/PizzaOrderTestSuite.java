package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testMargheritaPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizza();
        //When
        BigDecimal orderCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), orderCost);
    }

    @Test
    public void testMargheritaPizzaOrderGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizza();
        List<String> ingredientsTest = new ArrayList<>();
        //When
        ingredientsTest.add("dough");
        ingredientsTest.add("tomato sauce");
        ingredientsTest.add("mozzarella");
        List<String> ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(ingredientsTest, ingredients);
    }

    @Test
    public void testPizzaWithAllIngredientsAndSaucesGetCost() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizza();
        pizzaOrder = new DoubleDoughDecorator(pizzaOrder);
        pizzaOrder = new DoubleMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new mushroomsDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new TomatoSauceDecorator(pizzaOrder);
        //When
        BigDecimal pizzaOrderCost = pizzaOrder.getCost();
        //Then
        assertEquals(51, pizzaOrderCost.intValue());
    }

    @Test
    public void testPizzaWithAllIngredientsAndSaucesGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizza();
        pizzaOrder = new DoubleDoughDecorator(pizzaOrder);
        pizzaOrder = new DoubleMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new mushroomsDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new TomatoSauceDecorator(pizzaOrder);
        List<String> ingredientsTest = new ArrayList<>();
        //When
        ingredientsTest.add("dough");
        ingredientsTest.add("tomato sauce");
        ingredientsTest.add("mozzarella");
        ingredientsTest.add("double dough");
        ingredientsTest.add("double mozzarella");
        ingredientsTest.add("chicken");
        ingredientsTest.add("garlic dip");
        ingredientsTest.add("ham");
        ingredientsTest.add("mushrooms");
        ingredientsTest.add("onion");
        ingredientsTest.add("tomato dip");
        List<String> ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(ingredientsTest,ingredients);
    }
}