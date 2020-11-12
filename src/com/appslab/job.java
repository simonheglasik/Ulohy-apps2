package com.appslab;

public class job
{
    protected Type jobType;
    protected float salary;
    protected int bonus;
    job(float salary , int bonus)
    {
        this.salary = salary;
        this.bonus = bonus;
    }
    protected String getInfo()
    {
        return jobType.getJobName() + "'s" + " salary is " + salary + " and bonus is " + bonus;
    }
}
