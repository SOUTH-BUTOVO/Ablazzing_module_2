package org.javaacademy.lesson2.list_method;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Петр", "Дима", "Иван"));
        System.out.println(strings.get(1));

        strings.set(2, "Юрий");
        System.out.println(strings);

        System.out.println(strings.indexOf("Юрий"));

        System.out.println(strings + "11");
        List<String> subList = strings.subList(0, 2);
        System.out.println(subList + "1");
        subList.set(0, "Женя");
        System.out.println(subList + "2");
        System.out.println(strings + "22");

        List<String> list = List.of("Гена");
        //list.set(0, "Юрий");
    }
}
