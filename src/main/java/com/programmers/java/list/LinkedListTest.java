package com.programmers.java.list;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> aryLst = new LinkedList<Integer>();
        for(int i=1; i<=5; i++){
            aryLst.add(i);
        }
        System.out.println(aryLst);

        aryLst.remove(3);
        System.out.println(aryLst);

        for (int i=0; i<aryLst.size();i++){
            System.out.print(aryLst.get(i)+" ");
        }
    }
}
