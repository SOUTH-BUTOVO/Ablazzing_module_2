package org.javaacademy.lesson8.ex3;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        int i = 1;
        Stream.generate(() -> i).limit(100).forEach(System.out::print);
        System.out.println("\n----------");

        IntStream.range(1, 101).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");

        int[] array = IntStream.range(1, 101).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("----------");

        AtomicInteger aI = new AtomicInteger(1);
        Stream.generate(() -> aI.getAndIncrement()).limit(100).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");

        Stream.iterate(1, n -> n + 1).limit(100).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");
    }
}
