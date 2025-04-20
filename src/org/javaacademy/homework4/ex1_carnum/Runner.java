package org.javaacademy.homework4.ex1_carnum;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
    private final static int START_CAR_NUM = 1;
    private final static int END_CAR_NUM = 50;
    private final static String CAR_NUMBER_PATTERN = "А%03dАН799";
    private final static char PREFIX = 'к';
    private final static String SUFFIX = "се178";

    public static void main(String[] args) {

        // ИСПОЛЬЗОВАНИЕ FOR, WHILE ЗАПРЕЩЕНО В ЭТОЙ ДЗ! Только СТРИМЫ.
        //
        // Задание №1 - Список спец номеров
        // Нам необходимо распечатать список номеров, которые принадлежат чиновникам
        // 1. Создать класс машина. У машины есть номер.
        // 2. Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
        // 3. Создать 50 машин с номерами к0[01-50]се178 (где [01-50] - это все значения от 01 до 50)
        // 4. Объединить машины в единый стрим
        // 5. Оставить в объединенном стриме машины с номерами 04[0-9] - это номера, выдаваемые чиновникам
        // 6. Получить из оставшихся машин номера.
        // 7. Распечатать номера.
        // ожидаемый результат:
        // a040ан799
        // a041ан799
        // ...
        // k048се178
        // k049се178

        resultStream();
    }

    private static List<Car> listCars() {
        // Создание машин и номеров и объединение в один Стрим.
        List<Car> listCar1 = IntStream.range(START_CAR_NUM, END_CAR_NUM)
                .mapToObj(car -> new Car(String.format(CAR_NUMBER_PATTERN, car)))
                .toList();

        List<Car> listCar2 = IntStream.rangeClosed(START_CAR_NUM, END_CAR_NUM)
                .mapToObj(car -> new Car(PREFIX + String.format("%03d", car) + SUFFIX))
                .toList();

        return Stream.concat(listCar1.stream(), listCar2.stream()).toList();
    }

    private static void resultStream() {
        listCars().stream().filter(car -> {
            int num = Integer.parseInt(car.getNumber().substring(1, 4));
            return num >= 40 && num <= 49;
        }).forEach(System.out::println);
    }
}
