package com.appslab;

public class Programmer
{
    private float salary;
    private int bonus;
    public Programmer(float salary , int bonus)
    {
        this.bonus = bonus;
        this.salary = salary;
    }
    public String getInfo()
    {
        return  "Programmer’s salary is " + salary + " and bonus is " + bonus;
    }
}
