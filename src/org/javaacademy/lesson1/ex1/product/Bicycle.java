package org.javaacademy.lesson1.ex1.product;

public class Bicycle extends Product {

    public Bicycle(double price) {
        super(price);
    }

    public void go() {
        System.out.println("Велосипед едет!");
    }

    @Override
    public String toString() {
        return "Bicycle{" + "price=" + this.price + '}';
    }
}
