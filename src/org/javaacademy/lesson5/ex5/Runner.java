package org.javaacademy.lesson5.ex5;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        HashMap<String, Integer> warehouse = new HashMap<>();
        warehouse.put("Яблоки", 10);
        warehouse.put("Помидоры", 15);

        warehouse.put("Яблоки", warehouse.getOrDefault("Яблоки", 0) + 25);
        warehouse.merge("Помидоры", 5, Integer::sum);
        System.out.println(warehouse);
    }
}
