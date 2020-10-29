package com.appslab;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main
{

    public static void main(String[] args)
    {
        Person[] people = {new Person("Mario",33,2995) ,new Person("John",24,1899),new Person("Joe",30,4321) };
        System.out.println(containsA(people));
    }
    public static boolean containsA(Person[] people)
    {
        return Arrays.stream(people).anyMatch(n -> n.getName().contains("a"));
    }
}
