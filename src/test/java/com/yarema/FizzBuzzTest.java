package com.yarema;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzTest {

    private FizzBuzz unit;

    @Before
    public void createInstance() {
         unit = new FizzBuzz();
    }

    @Test
    public void methodPrintListIsCorrectListReturn() {
        Assert.assertEquals(new ArrayList<String>(Arrays.asList("1", "2")), unit.printList(new ArrayList<Integer>(Arrays.asList(1, 2))));
    }

    @Test
    public void methodIsCorrectNumberSubstituteToFizz() {
        Assert.assertEquals(new ArrayList<String>(Arrays.asList("1", "2", "Fizz")), unit.printList(new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
    }

}
