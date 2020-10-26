package com.appslab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = {1, 1, 1, 2, 2, 3, 4, 5};
        var list = new ArrayList<Integer>();
        for(int i = 0 ; i < numbers.length; i++)
            list.add(numbers[i]);
        printList(list);
    }
    public static void printList(ArrayList<Integer> list)
    {
        if(list.isEmpty())
            System.out.println("list is empty");
        list.forEach(n -> System.out.println(n));
    }
}
