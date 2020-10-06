package com.appslab;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args)
    {
        var ivan = new warrior("Ivan",4,6,4);
        var pista = new warrior("Pišta",6,3,8);

        var liquor = new Item("Liquor",10);
        var sock = new Item("Sock",3);
        var goldenWatch = new Item("Golden Watch",40);
        var hat = new Item("Nice looking hat",30);

        var in = new Scanner(System.in);
        ivan.addItem(sock);
        ivan.addItem(goldenWatch);
        pista.addItem(liquor);
        pista.addItem(hat);
        while (true)
        {
            fight(ivan, pista);
            System.out.println("Press enter to see next fight");
            in.nextLine();
        }
    }
    public static void fight(warrior one,warrior two)
    {
        var rnd = new Random();

        int oneTotal = one.getLife() + one.getMuscle() + one.getSpeed();
        int twoTotal = two.getLife() + two.getMuscle() + two.getSpeed();

        double oneChance = chances(oneTotal,twoTotal);
        double twoChance = 100 - oneChance;

        System.out.println(one.getName() + " is standing aginst " + two.getName());

        int fight = rnd.nextInt(100);
        if(one.getLife() == 0)
        {
            System.out.println(one.getName() + " is dead");
            return;
        }
        if(two.getLife() == 0)
        {
            System.out.println(two.getName() + " is dead");
            return;
        }
        System.out.println("Total force of " + one.getName() + " is " + oneTotal);
        System.out.println("Total force of " + two.getName() + " is " + twoTotal);
        System.out.println(".....................................................");
        if(fight < oneChance)
        {
            var loot = new Item();
            System.out.println(one.getName() + " won the fight");
            if(!two.getItems().isEmpty())
            {
                for (var item : two.getItems())
                    loot = item;
            }
            one.getItems().add(loot);
            two.getItems().remove(loot);
            two.setLife(two.getLife() - 1);
            System.out.println(one.getName() + " is taking " + loot.getName());
        }
        else
        {
            System.out.println(two.getName() + " won the fight");
            var loot = new Item();
            if(!one.getItems().isEmpty())
            {
                for (var item : one.getItems())
                    loot = item;
            }
            two.getItems().add(loot);
            one.getItems().remove(loot);
            one.setLife(one.getLife() - 1);
            System.out.println(two.getName() + " is taking " + loot.getName());
        }
    }
    public static double chances(double one ,double two)
    {
        double percent = (one + two) / 100;
        return one / percent ;
    }
}
