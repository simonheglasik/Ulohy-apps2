package com.appslab;

import java.util.ArrayList;

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
        var returnList = new ArrayList<Integer>();
        list.forEach(n -> {
            if(n % 2 == 0)
                returnList.add(n);
        });
        System.out.println(returnList);
    }
}
