package com.appslab;

public class Teacher
{
    private float salary;
    private int bonus;
    public Teacher(float salary , int bonus)
    {
        this.bonus = bonus;
        this.salary = salary;
    }
    public String getInfo()
    {
        return  "Teacher’s salary is " + salary + " and bonus is " + bonus;
    }
}
