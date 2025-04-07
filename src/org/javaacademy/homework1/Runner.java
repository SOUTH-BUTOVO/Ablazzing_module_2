package org.javaacademy.homework1;

import org.javaacademy.homework1.zoo.Bird;
import org.javaacademy.homework1.zoo.Dog;
import org.javaacademy.homework1.zoo.Tiger;
import org.javaacademy.homework1.zoo.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        //Задание №1 Зоопарк
        //1. Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
        //Общий родитель - животное (никаких атрибутов и методов в нем нет).
        //2. Создать зоопарк, который может хранить в себе 3 животных любого типа.
        //Т.е. могут быть следующие зоопарки:
        // Зоопарк в котором Тигр, Тигр, Птица
        // Зоопарк в котором Собака, Собака, Собака
        // Зоопарк в котором Птица, Птица, Тигр.
        //3. Сделать геттеры на всех животных.
        //Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
        //Т.е. создали зоопарк Тигр, Собака, Птица (положили в этот зоопарк животных при создании).
        //Получили первое животное (тигра) - вызвали у него рык
        //Получили второе животное (собака) - вызвали у него лай
        //Получили первое животное (птица) - вызвали у него полет
        //Запрещено пользоваться instanceOf.
        ex1();

        //Задание №2 Гидрометцентр
        //Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
        //Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
        //Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
        //Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
        //Запрещено использовать массивы.
        ex2();

        // Задание №3 Ресторанный гуру
        // Николай Петрович ходит по ресторанам. За 5 дней он был во множестве ресторанов.
        // Он обратился к вам, чтобы узнать в каком ресторане(ах) он был каждый день
        // (т.е. найти ресторан(ы) в которых он был и в понедельник, и во вторник, и в среду и тд).
        ex3();
    }

    private static void ex3() {
        List<String> monday = List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо");
        List<String> tuesday = List.of("Вареничная №1", "Пушкин", "Чебуречная №1", "Ниппон", "Реберная");
        List<String> wednesday = List.of("Реберная", "Арарат", "Майя", "Ниппон", "Таксим");
        List<String> thursday = List.of("Грех", "Ваниль", "Реберная", "Пянсе", "Фо бо");
        List<String> friday = List.of("Бёрдс", "Реберная", "Андерсон", "Ниппон", "Чифанька");

        List<String> res = new ArrayList<>(monday);
//        res.retainAll(tuesday);
//        res.retainAll(wednesday);
//        res.retainAll(thursday);
//        res.retainAll(friday);
        for (List<String> day : List.of(tuesday, wednesday, thursday, friday)) {
            res.retainAll(day);
        }
        System.out.println("Николай Петрович, каждый день был в: " + res);
    }

    private static void ex2() {
        List<Integer> temperatureJanuary = List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1);
        List<Integer> temperatureFebruary = List.of(-8, -10, -12, -13, -15, -16, -12, -7, -8, -10, -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1);
        List<Integer> totalTemperature = new ArrayList<>();
        totalTemperature.addAll(temperatureJanuary);
        totalTemperature.addAll(temperatureFebruary);

        double averageAirTemperature = 0;
        for (Integer temperature : totalTemperature) {
            averageAirTemperature += temperature;
        }

        System.out.println("Середнесуточная температура воздуха за 2 месяца составила: "
                + averageAirTemperature / totalTemperature.size());
    }

    private static void ex1() {
        Zoo<Dog, Dog, Dog> dogDogDogZoo = new Zoo<>(new Dog(), new Dog(), new Dog());
        Dog dog = dogDogDogZoo.getAnimal2();
        dog.voice();

        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(new Tiger(), new Dog(), new Bird());
        Tiger tiger = zoo.getAnimal1();
        tiger.voice();
        Bird bird = zoo.getAnimal3();
        bird.fly();
        Dog dog2 = zoo.getAnimal2();
        dog2.voice();
    }
}
