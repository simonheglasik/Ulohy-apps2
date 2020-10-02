package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello AppsLab 2020! haa");
        Person[] personel = {new Person("Martin", 17,1243), new Person("Karol", 38, 6890), new Person("Adam",46,7023)};
        System.out.println(budgetSum(personel));

    }
    public static int budgetSum(Person[] people)
    {
        int budget = 0;
        for (var person:people)
        {
            budget += person.getBudget();
        }
        return budget;
    }
}
