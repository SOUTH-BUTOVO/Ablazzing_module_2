package org.javaacademy.lesson9.ex3;

public class Truck implements Drive {

//    @Override
//    public void fly() {
//        throw new UnsupportedOperationException("Операция не поддерживается");
//    }

    @Override
    public void go() {
        System.out.println("Тягач едет");
    }
}
