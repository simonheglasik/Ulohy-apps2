package com.appslab;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
        var list = new ArrayList<Integer>();
        for(int i = 0 ; i < 5; i++)
            list.add(i);
        System.out.println(multipleByLenght(list));
    }
    public static ArrayList<Integer> multipleByLenght(ArrayList<Integer> list)
    {
        return list.stream().map(n -> n * list.size()).collect(Collectors.toCollection(ArrayList::new));
    }
}
