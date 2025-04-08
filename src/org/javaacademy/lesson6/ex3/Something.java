package org.javaacademy.lesson6.ex3;

@FunctionalInterface
public interface Something {

    void prt();

    static void refMethod() {
        System.out.println("Это референсный метод");
    }
}
