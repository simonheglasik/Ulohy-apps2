package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        var triangle = new Triangle(3,4,5);
        System.out.println("area: " + triangle.getArea());
        System.out.println("perimeter: " + triangle.getPerimeter());
    }
}
