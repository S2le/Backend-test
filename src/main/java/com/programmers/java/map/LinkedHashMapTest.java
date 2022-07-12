package com.programmers.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {

        Map<String, String> lmap= new LinkedHashMap<String, String>();

        lmap.put("Google", "USA");
        lmap.put("Naver", "Korea");
        lmap.put("Facebook", "USA");

        System.out.println("Value for 1 is "+lmap.get("Google"));

        for (Map.Entry<String, String> e: lmap.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}
