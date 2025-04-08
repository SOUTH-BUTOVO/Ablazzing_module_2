package org.javaacademy.lesson6.ex1;

import java.util.Random;

public class Runner {
    private static int[] array = new int[1];

    public static String substring(String text) {
//        return text.substring(0, 1);
        return new Random().nextInt() + "";
    }

    private static int calc(int a, int b) {
        array[0] = a + b;
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(substring("text"));
        calc(2, 3);
    }
}
