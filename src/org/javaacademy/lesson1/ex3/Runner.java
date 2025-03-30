package org.javaacademy.lesson1.ex3;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello", "Java", "!");
        System.out.println(stringContainer);

        Container<Integer[]> integerContainer = new Container<>(new Integer[] {1, 2, 3},
                                                                new Integer[] {4, 5, 6},
                                                                new Integer[] {7, 8, 9});
        System.out.println(integerContainer);
    }
}
