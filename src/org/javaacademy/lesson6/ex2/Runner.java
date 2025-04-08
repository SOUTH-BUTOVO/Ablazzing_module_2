package org.javaacademy.lesson6.ex2;

import org.javaacademy.lesson6.ex2.car.Audi;
import org.javaacademy.lesson6.ex2.car.Bmw;
import org.javaacademy.lesson6.ex2.car.Car;
import org.javaacademy.lesson6.ex2.factory.AudiFactory;
import org.javaacademy.lesson6.ex2.factory.BmwFactory;
import org.javaacademy.lesson6.ex2.factory.CarFactory;

import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();

        Car audi1 = audiFactory.makeCar();
        Car bmw1 = bmwFactory.makeCar();

        System.out.println(audi1);
        System.out.println(bmw1);
        System.out.println("--------------");

        CarFactory audiFunctionalFactory = () -> {
            System.out.println("Ауди создаётся");
            return new Audi();
        };

        Supplier<Car> audiFunctionalFactory3 = () -> {
            System.out.println("Ауди создаётся");
            return new Audi();
        };

        CarFactory bmwFunctionalFactory = Bmw::new;

        Car audi2 = audiFunctionalFactory.makeCar();
        Car audi3 = audiFunctionalFactory3.get();
        Car bmw2 = bmwFunctionalFactory.makeCar();

        System.out.println(audi2);
        System.out.println(audi3);
        System.out.println(bmw2);
    }
}
