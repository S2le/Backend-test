package com.programmers.java.lambda;

public class Main {
    public static void main(String[] args) {

        MySupplier s = () -> "Hello World";
        MyMapper m = (str) -> str.length();
        // MyConsumer c = (i) -> System.out.println(i); //기본람다식
        MyConsumer c = System.out::println; //메소드 레퍼런스
        MyRunnable r = () -> c.consume(m.map(s.supply()));

        r.run();
    }
}
