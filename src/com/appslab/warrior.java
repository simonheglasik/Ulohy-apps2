package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class warrior
{
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private ArrayList<Item> items = new ArrayList<>();


    public warrior(String name,int life,int speed, int muscle)
    {
        if(life > 10)
            life = 10;
        if(speed > 10)
            speed = 10;
        if(muscle > 10)
            muscle = 10;
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMuscle() {
        return muscle;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life)
    {
        this.life = life;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void addItem(Item item)
    {
        items.add(item);
    }
}
