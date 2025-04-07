package org.javaacademy.lesson5.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String number1 = "4001A2020";
        String number2 = "4002A2121";
        String number3 = "4003A2222";
        List<String> list = List.of(number1, number2, number3, number1);

        HashSet<String> set = new HashSet<>(list);
        set.add("4001A2020");
        System.out.println(set);

        System.out.println(new ArrayList<>(set).get(0));
        System.out.println(set.contains(number1));
    }
}
