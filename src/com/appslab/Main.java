package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello AppsLab 2020! haa");
        System.out.println(equalSlices(200,50,2));
    }
    public static boolean equalSlices(int slices,int people,int sliceForEach){
        return slices % people * sliceForEach == 0;
    }
}
