package org.javaacademy.lesson9.ex3;

public class Boeing implements Flyable, Drive {

    @Override
    public void fly() {
        System.out.println("Самолёт летит");
    }

    @Override
    public void go() {
        System.out.println("Самолёт едет");
    }
}
