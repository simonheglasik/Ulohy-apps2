package com.appslab;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(EqualValue(3,3,2));
    }
    public static int EqualValue(int a , int b, int c){
        int equal = 0;
        int numbers[] = {a,b,c};
        for (int i = 0;i < numbers.length;i++){
            for (int si = 0;si < numbers.length;si++){
                if(numbers[i] == numbers[si] && i != si){
                    equal++;
                }
            }
        }
        return equal;
    }
}