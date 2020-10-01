package com.appslab;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello AppsLab 2020! haa");
        while (true)
            Game();
    }
    private static Scanner in = new Scanner(System.in);
    public static void Game()
    {
       var rnd = new Random();
       String[] tools = {"rock","scissors","paper"};
       for (int i = 0;i < tools.length;i++)
        System.out.println(i + 1 + ". " + tools[i]);
       int a = in.nextInt();
       a = a - 1;
       int b = rnd.nextInt(3);
       System.out.println(tools[b]);

       if(a == b)
           System.out.println("TIE");
       else
           {
                if(a == b - 1 || a == b + 2)
                    System.out.println("player won");
                else
                    System.out.println("player lost");
           }
    }
}
