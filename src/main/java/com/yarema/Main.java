package com.yarema;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 100; i++)
            integers.add(i);
        new FizzBuzz().printList(integers).forEach(System.out::println);
    }
}
