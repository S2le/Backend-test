package com.programmers.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Google", "USA");
        hm.put("Naver", "Korea");
        hm.put("Facebook", "USA");

        for (Map.Entry<String, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        HashMap<String, String> tmpHm1 = new HashMap<String, String>();
        HashMap<String, Object> tmpHm2 = new HashMap<String, Object>();

        ArrayList<HashMap<String, String>> aryLst1 = new ArrayList<HashMap<String, String>>();

        for(int i = 0;i<10;i++){
            tmpHm1 = new HashMap<String, String>();
            tmpHm1.put("A" + i, i + "");
            aryLst1.add(tmpHm1);
        }
        tmpHm2.put("LST", aryLst1);
        System.out.println(tmpHm2.get("LST"));
    }
}
