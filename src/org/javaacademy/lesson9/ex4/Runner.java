package org.javaacademy.lesson9.ex4;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length).thenComparing(String::hashCode);
        Map<String, Integer> map = new TreeMap<>(comparator);
        Shop shop = new Shop(map);
        shop.addProduct("яблоки", 10);
        shop.addProduct("яблоки", 20);
        shop.addProduct("финики", 20);
        shop.addProduct("апельсины", 20);

        //System.out.println(shop);
        shop.getProducts().forEach((k, v) -> System.out.println(k + " " + v));
    }
}
