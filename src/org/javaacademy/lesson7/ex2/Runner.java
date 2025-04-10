package org.javaacademy.lesson7.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<String> names = List.of("Петр", "Иван", "Олег");
        for (String name : names) {
//            System.out.println(name);
        }

        names.stream().forEach(e -> System.out.println(e));

        Stream.of("Name".split("")).forEach(System.out::print);
    }
}
