package com.appslab;

class Student
{
    private String name;
    private int number;
    private int phone;
    private String address;
    public Student(String name,int number,int phone,String address)
    {
        this.name = name;
        this.number = number;
        setPhone(phone);
        setAddress(address);
    }
    public  Student()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
