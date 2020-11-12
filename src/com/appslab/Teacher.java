package com.appslab;

public class Teacher extends job
{
    public Teacher(float salary , int bonus )
    {
        super(salary, bonus);
        jobType = Type.TEACHER;
    }
}
