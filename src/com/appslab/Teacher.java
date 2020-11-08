package com.appslab;

public class Teacher extends job
{
    public Teacher(float salary , int bonus )
    {
        this.salary = salary;
        this.bonus = bonus;
        jobType = type.teacher;
    }
}
