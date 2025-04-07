package org.javaacademy.lesson5.ex4;

import java.util.Map;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(170, "Иванов");
        treeMap.put(167, "Петров");
        treeMap.put(180, "Сидоров");
        System.out.println(treeMap);

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.floorEntry(167));
        //System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap);

        System.out.println("---------------------");
        System.out.println(treeMap.values());
        System.out.println(treeMap.keySet());

        System.out.println("Печать роста всех студентов");
        for (Integer keys : treeMap.keySet()) {
            System.out.println(keys);
        }

        System.out.println("Печать фамилий всех студентов");
        for (String values : treeMap.values()) {
            System.out.println(values);
        }

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
