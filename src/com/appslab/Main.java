package com.appslab;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        var list = new ArrayList<Integer>();
        list.add(1);
        addIfNotExists(list,2);
        System.out.println(list);
    }
    public static void addIfNotExists(ArrayList<Integer> list , int number)
    {
        if(!list.contains(number))
        {
            list.add(number);
        }
    }
}

