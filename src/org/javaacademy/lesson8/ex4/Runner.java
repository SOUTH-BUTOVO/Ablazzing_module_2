package org.javaacademy.lesson8.ex4;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 5);
        //stream1.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.of(8, 10);
        List<Integer> list = Stream.concat(stream1, stream2).toList();
        System.out.println(list);
    }
}
