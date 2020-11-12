package com.appslab;

public enum Type
{
    PROGRAMMER("programemr"),
    TEACHER("teacher"),
    DRIVER("driver");
    private final String jobName;
    private Type(String str){
        this.jobName = str;
    }

    public String getJobName() {
        return jobName;
    }
}
