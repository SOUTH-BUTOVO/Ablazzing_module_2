package org.javaacademy.lesson5.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Integer human1 = 160;
        Integer human2 = 170;
        Integer human3 = 180;
        Integer human4 = 150;
        List<Integer> humans = List.of(human1, human2, human3, human4);
        System.out.println(humans);

        TreeSet<Integer> treeSet = new TreeSet<>(humans);
        System.out.println(treeSet.descendingSet());

        System.out.println(human2.compareTo(human4));

        TreeSet<Student> students = new TreeSet<>(List.of(
                new Student(160),
                new Student(170),
                new Student(180),
                new Student(150)));
        System.out.println(students);

        long start = System.currentTimeMillis();
        TreeSet<Integer> integers1 = new TreeSet<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            integers2.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
