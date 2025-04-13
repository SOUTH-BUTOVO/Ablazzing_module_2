package org.javaacademy.lesson8.ex5;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 7, 9);
        integers.stream().forEach(System.out::print);
    }
}
