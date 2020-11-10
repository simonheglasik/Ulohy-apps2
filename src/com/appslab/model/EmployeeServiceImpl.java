package com.appslab.model;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService
{

    @Override
    public double sumAllSalaries(List<job> jobs) {
        return jobs.stream().mapToDouble(job::getSalary).sum();
    }

    @Override
    public int sumAllBunuses(List<job> jobs) {
        return jobs.stream().mapToInt(job::getBonus).sum();
    }
}
