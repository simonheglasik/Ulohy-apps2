package com.appslab;

public class Triangle
{
    private int a;
    private int b;
    private int c;

    private double perimeter;
    private double area;

    public Triangle(int a,int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;

        perimeter = a + b + c ;
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
