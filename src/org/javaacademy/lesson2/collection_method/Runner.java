package org.javaacademy.lesson2.collection_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        String[] names = {"Пётр", "Юрий", "Евгений"};

        String[] namesBig = new String[names.length + 1];
        namesBig[names.length] = "Олег";
        for (int i = 0; i < names.length; i++) {
            namesBig[i] = names[i];
        }

        System.arraycopy(names, 0, namesBig, 0, names.length);
        IntStream.range(0, names.length).forEach(i -> namesBig[i] = names[i]);

        System.out.println(Arrays.toString(namesBig));

        ArrayList<String> namesList = new ArrayList<>(List.of(names));
        namesList.add("Олег");
        System.out.println(namesList);

        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 10));
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());
        System.out.println(integers.contains(4));
        Integer[] array = integers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        integers.add(0, 11);
        System.out.println(integers);

        boolean remove = integers.remove(Integer.valueOf(11));
        System.out.println(integers);

        boolean containsAll = integers.containsAll(List.of(1, 4, 2));
        System.out.println(containsAll);

        integers.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);

        integers.removeAll(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);

        ArrayList<Integer> firstList = new ArrayList<>(List.of(1, 5, 6, 7));
        ArrayList<Integer> secondList = new ArrayList<>(List.of(2, 5, 7, 10));
        firstList.retainAll(secondList);
        System.out.println(firstList);

        integers.clear();
        System.out.println(integers);
    }
}
