package com.appslab;

public class job
{
    public enum type
    {
        programmer,
        teacher;
    }
    protected type jobType;
    protected float salary;
    protected int bonus;
    protected String getInfo()
    {
        return jobType + "'s" + " salary is " + salary + " and bonus is " + bonus;
    }
}
