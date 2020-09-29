package com.appslab;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello AppsLab 2020! haa");
        Game();
    }
    private static Scanner in = new Scanner(System.in);
    public static void Game()
    {
       var rnd = new Random();
       String[] tools = {"rock","paper","scissors"};
       for (int i = 0;i < tools.length;i++)
        System.out.println(i + 1 + ". " + tools[i]);
       int a = in.nextInt();
       int b = rnd.nextInt(3);
       //System.out.println(b + 1);
       if(a == b)
           System.out.println("TIE");
    }
}
