package org.javaacademy.lesson2.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0, 16);

//        integers.set(0, 17);

        System.out.println(integers.size());
        integers.add(20);
        System.out.println(integers);

        long timeStart = System.currentTimeMillis();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(list.size(), i);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);
    }
}
