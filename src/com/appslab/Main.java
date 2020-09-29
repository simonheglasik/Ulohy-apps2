
package com.appslab;


public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hello AppsLab 2020! haa");
        int[] numbers = {2,3,2,5,1};
        numbers = multipleByLenght(numbers);
        for ( int number: numbers
             ) {
            System.out.println(number);
        }

    }

    public static int[] multipleByLenght(int[] numbers)
    {
        for (int number = 0; number < numbers.length;number++)
        {
            numbers[number] = numbers[number] * numbers.length;
        }
        return numbers;
    }
}
