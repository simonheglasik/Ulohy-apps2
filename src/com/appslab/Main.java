package com.appslab;

public class Main {

    public static void main(String[] args) {
        var jano = new Student("Jano" , 1,123456,"Legionarska 201001 Zilina");
        var jaroslav = new Student("Jaroslav",2,578232," Legionarska 101002 Zilina");
        System.out.println(jano.getNumber() + ", " + jano.getPhone() + ", " + jano.getAddress());
        System.out.println(jaroslav.getNumber() + ", " + jaroslav.getPhone() + ", " + jaroslav.getAddress());

    }
}
