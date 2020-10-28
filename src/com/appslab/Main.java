package com.appslab;

import java.util.ArrayList;

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
        var returnList = new ArrayList<Integer>();
        list.stream().forEach(n -> {
            returnList.add((int) (n.longValue() * list.size()));
        });
        return returnList;
    }
}
