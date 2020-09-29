package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello AppsLab 2020! haa");
        System.out.println(isPalindrome("mom"));


    }
    public static boolean isPalindrome(String word)
    {
        String s = "";
       for (int i = word.length() - 1;i >= 0; i--)
       {
              s = s + word.charAt(i);
       }
       System.out.println(s);
       System.out.println(word);
       return s.equals(word);
    }
}
