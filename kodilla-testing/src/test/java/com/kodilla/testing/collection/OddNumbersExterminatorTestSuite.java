package com.kodilla.testing.collection;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class OddNumbersExterminatorTestSuite {
    @Test
    public void testExterminateNoData(){
        //given
        ArrayList<Integer> inputData = new ArrayList<>();
        OddNumbersExterminator underTest = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = underTest.exterminate(inputData);
        //then
        Assert.assertEquals(0,result.size());
    }
    @Test
    public void testExterminateExampleData(){
        //given
        ArrayList<Integer> inputData = new ArrayList<>();
        inputData.add(1);
        inputData.add(2);
        inputData.add(3);
        inputData.add(4);
        inputData.add(5);
        inputData.add(6);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        OddNumbersExterminator underTest = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = underTest.exterminate(inputData);
        //then
        Assert.assertEquals(expected,result);
    }
}