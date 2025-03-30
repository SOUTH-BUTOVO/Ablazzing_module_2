package org.javaacademy.lesson1.ex4;

public class CarWashing {
    private int money;

    public <T extends Car> T wash(T car) {
        car.setClean(true);
        money += 1000;
        return car;
    }

    public int getMoney() {
        return money;
    }
}
