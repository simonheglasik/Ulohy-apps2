package com.appslab;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3, 4, 5};
        var list = new ArrayList<Integer>();
        for(int i = 0 ; i < numbers.length; i++)
            list.add(numbers[i]);
        printEven(list);
    }
    public static void printEven(ArrayList<Integer> list)
    {
        System.out.println(list.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(ArrayList::new)).toString());
    }
}
