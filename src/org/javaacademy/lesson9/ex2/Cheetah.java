package org.javaacademy.lesson9.ex2;

public class Cheetah extends Animal {

    public Cheetah(int speed) {
        super(speed);
    }

    @Override
    public void run() {
//        if (speed < 10) {
//            throw new RuntimeException("Гепард сломался");
//        }
        if (speed < 100) {
            super.run();
        } else {
            System.out.println("Гепард бежит молниеносно!");
        }
    }
}
