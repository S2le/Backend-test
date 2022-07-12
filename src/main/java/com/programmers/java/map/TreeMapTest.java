package com.programmers.java.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, String> tmap = new TreeMap<String,String>();

        tmap.put("Google", "USA");
        tmap.put("Naver", "Korea");
        tmap.put("Facebook", "USA");

        System.out.println("Value for 1 is "+tmap.get("Google"));

        for (Map.Entry<String, String> e: tmap.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}
