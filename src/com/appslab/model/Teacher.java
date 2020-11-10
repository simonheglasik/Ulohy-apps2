package com.appslab.model;

import com.appslab.model.job;

public class Teacher extends job
{
    public Teacher(float salary , int bonus )
    {
        this.salary = salary;
        this.bonus = bonus;
        jobType = type.teacher;
    }
}
