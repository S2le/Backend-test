package com.programmers.java.stream;

import java.util.Random;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        Stream.iterate(0, (i) -> i + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
