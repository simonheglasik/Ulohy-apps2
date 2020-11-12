package com.appslab;

public class Driver extends job
{
    public Driver(float salary , int bonus )
    {
        super(salary, bonus);
        jobType = Type.DRIVER;
    }
}
