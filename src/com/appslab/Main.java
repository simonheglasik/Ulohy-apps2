package com.appslab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello AppsLab 2020! haa");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 100;i++)
            list.add(i);
        System.out.println(deleteEveryEven(list));
    }

    public static ArrayList<Integer> deleteEveryEven(ArrayList<Integer> list)
    {
        var returnList = new ArrayList<Integer>();
        returnList = list;
        returnList.removeIf(n -> n % 2 == 0);
        return returnList;
    }
}
