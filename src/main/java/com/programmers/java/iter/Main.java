package com.programmers.java.iter;

import com.programmers.java.collection.MyCollection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyIterator<String> iter =
                new MyCollection<>(Arrays.asList("A", "CA", "DSB", "ASDC", "ASDFE"))
                        .iterator();

        while(iter.hasNext()) {
            String s = iter.next();
            int len = s.length();
            if(len % 2 == 0) continue;
            System.out.println(s);
        }
    }
}
