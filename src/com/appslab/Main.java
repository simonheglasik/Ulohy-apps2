package com.appslab;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello AppsLab 2020! haa");
        int[] numbers = {1, 1, 1, 2, 2, 3, 4, 5};
        var list = new HashSet<Integer>();
        Arrays.stream(numbers).forEach(n -> list.add(n));
        System.out.println(list);
    }
}
