package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello AppsLab 2020! haa");
        System.out.println(IsTriangle(12,12,4));
    }
    public static boolean IsTriangle(int a,int b, int c){
        return a + b > c &&  a+ c > b && c + b > a;
    }
}
