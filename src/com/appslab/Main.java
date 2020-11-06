package com.appslab;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        map.put("jedna", 1);
        map.put("dva", 2);
        map.put("tri", 3);
        addElement("tri", 24, map);
        System.out.println(map);
    }

    public static void addElement(String key, int value, HashMap<String, Integer> map)
    {
        if(!map.keySet().contains(key))
            map.put(key,value);
    }
}
