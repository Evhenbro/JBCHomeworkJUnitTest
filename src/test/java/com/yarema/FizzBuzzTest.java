package com.yarema;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzTest {

    private static FizzBuzz unit;

    @Test
    public void methodPrintListIsCorrectListReturn() {
        Assert.assertEquals(new ArrayList<String>(Arrays.asList("1", "2")), unit.printList(new ArrayList<Integer>(Arrays.asList(1, 2))));
    }

}
