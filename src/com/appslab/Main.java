package com.appslab;

import java.sql.Date;

public class Main {

    public static void main(String[] args)
    {
        var programmer = new JobPosition("IT Programmer",2100);
        var employee = new Employee("Jožko","Mrkvička",new Date(90,7,4),programmer);
        System.out.println(employee.getName() + "," + employee.getSurname() + "," + employee.getDateofBirth() + "," + employee.getJob().getName() + "," + "salary:" + employee.getJob().getSalary());
    }
}
