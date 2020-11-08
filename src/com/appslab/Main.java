package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        var pro = new Programmer(1500, 300);
        var teach = new Teacher(1000, 200);
        System.out.println(pro.getInfo() + " and " + teach.getInfo());
    }
}
