package com.programmers.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = Stream.generate(() -> r.nextInt(200))
                .limit(5)
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
