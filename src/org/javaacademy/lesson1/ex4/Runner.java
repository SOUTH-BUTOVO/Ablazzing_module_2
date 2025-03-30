package org.javaacademy.lesson1.ex4;

public class Runner {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar();
        Bus bus = new Bus();
        CarWashing carWashing = new CarWashing();
        LightCar wash = carWashing.wash(lightCar);
        Bus wash2 = carWashing.wash(bus);
        System.out.println(wash.getClass());
        System.out.println(carWashing.getMoney());
    }
}
