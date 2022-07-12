package com.programmers.java.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList예제
        ArrayList<Integer> aryLst = new ArrayList<Integer>();
        for(int iCnt = 1; iCnt <= 5; iCnt++){
            aryLst.add(iCnt);
        }
        System.out.println(aryLst);

        aryLst.remove(3);
        aryLst.set(2, 99);
        aryLst.add(55);
        System.out.println(aryLst);

        for(int i =0;i<aryLst.size();i++){
            System.out.print(aryLst.get(i)+" ");
        }
    }
}
