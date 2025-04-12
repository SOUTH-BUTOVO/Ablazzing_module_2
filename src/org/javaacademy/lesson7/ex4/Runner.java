package org.javaacademy.lesson7.ex4;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        MyOptional myOptional = MyOptional.ofNullable(null);
        String value = myOptional.orElseOrThrow();

//        MyOptional myOptional2 = MyOptional.of(null);

        System.out.println(optional.orElse("").contains("П"));
        System.out.println(myOptional.orElse("").contains("П"));

//        String name = null;
//        if (name == null) {
//            name = "";
//        }

//        System.out.println(Objects.isNull(name));

//        String name = myOptional.orElse();
//        System.out.println(name);
//        System.out.println(myOptional);

    }
}
