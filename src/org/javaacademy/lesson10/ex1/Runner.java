package org.javaacademy.lesson10.ex1;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Cola> colas = List.of(new Cola(20));

        Storage storage2 = new Storage(colas);
//        Storage storage1 = new Storage(List.of(new Cola(1)));

//        storage2.addProduct(new Cola(1));

//        Storage<Product> colaStorage = new Storage<>(List.of(new Cola(1)));
//        colaStorage.addProduct(new Juice(1));
//        colaStorage.addProduct(new Cola(1));
//        System.out.println(storage2.getProducts());

        storage2.addProduct(new Juice(1));
        System.out.println(storage2.getProducts());
        System.out.println("---------");

        System.out.println(storage2.getIndexProduct(0));
        System.out.println(storage2.getIndexProduct(1));

        Consumer<Cola> consumer = e -> e.open();
        consumer.accept(new Cola(20));

        Stream.generate(() -> new Cola(1));
//        colas.stream().forEach(consumer);
    }
}
