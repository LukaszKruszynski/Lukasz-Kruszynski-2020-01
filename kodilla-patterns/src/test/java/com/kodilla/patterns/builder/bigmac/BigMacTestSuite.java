package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {

        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Pszenna z makiem")
                .burgers(7)
                .sauce("BBQ")
                .ingredients("ser chedar")
                .ingredients("cebula czerwona")
                .ingredients("ser panierowany")
                .ingredients("prazona cebulka")
                .ingredients("piklowany ogorek")
                .ingredients("pomidor")
                .ingredients("pieczarki")
                .ingredients("szczypiorek")
                .ingredients("salata lodowa")
                .build();
        System.out.println(bigMac);

        //When
        String bun = bigMac.getBun();
        int howManyBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        String sauce = bigMac.getSauce();

        //Then
        Assert.assertEquals("Pszenna z makiem", bun);
        Assert.assertEquals(7, howManyBurgers);
        Assert.assertEquals(9, howManyIngredients);
        Assert.assertEquals("BBQ", sauce);
    }
}
