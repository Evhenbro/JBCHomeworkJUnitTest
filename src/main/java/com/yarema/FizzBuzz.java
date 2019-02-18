package com.yarema;

import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> printList(ArrayList<Integer> lists) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Integer list: lists) {
            if ((list % 5) == 0.0) {
                arrayList.add("Buzz");
            } else if ((list % 3) == 0.0) {
                arrayList.add("Fizz");
            } else
                arrayList.add("" + list);
        }
        return arrayList;
    }
}
