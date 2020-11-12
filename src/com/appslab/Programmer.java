package com.appslab;

public class Programmer extends job
{
    public Programmer(float salary , int bonus)
    {
        super(salary, bonus);
        this.jobType = Type.PROGRAMMER;
    }
}
