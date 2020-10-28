package com.appslab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello AppsLab 2020! haa");
    }
    public static void multipleByLenght(ArrayList<Integer> list)
    {
        list.stream().forEach(n -> n *= 2);
    }
}
