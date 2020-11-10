package com.appslab;

import com.appslab.model.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        var pro = new Programmer(1500, 300);
        var teach = new Teacher(1000, 200);
        var driver = new Driver(700,300);
        var list = Arrays.asList(pro,teach,driver);
        var srvs = new EmployeeServiceImpl();
        System.out.println(srvs.sumAllSalaries(list) + " " + srvs.sumAllBunuses(list));
    }
}
