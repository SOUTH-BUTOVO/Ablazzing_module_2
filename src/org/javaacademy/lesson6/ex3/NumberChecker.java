package org.javaacademy.lesson6.ex3;

@FunctionalInterface
public interface NumberChecker {

    boolean check(double num);

    static boolean verify(double num) {
        return num % 2 == 0;
    }

    static boolean verifyBigger(double num) {
        return num > 10;
    }
}
