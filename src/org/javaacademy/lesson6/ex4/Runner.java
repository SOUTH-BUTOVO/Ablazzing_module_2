package org.javaacademy.lesson6.ex4;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {
        Function<Girl, Integer> convertToAge = (girl) -> girl.getAge();
        Girl girl = new Girl(21);
        System.out.println(convertToAge.apply(girl));
    }
}
