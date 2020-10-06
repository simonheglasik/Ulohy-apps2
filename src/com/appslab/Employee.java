package com.appslab;

import java.util.Date;

public class Employee
{
    private String name;
    private String surname;
    private Date dateofBirth;
    private JobPosition job;

    public Employee(String name, String surname, Date dateofBirth,JobPosition job)
    {
        this.name = name;
        this.surname = surname;
        this.dateofBirth = dateofBirth;
        this.job = job;
    }


    public JobPosition getJob() {
        return job;
    }

    public void setJob(JobPosition job) {
        this.job = job;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }
}
