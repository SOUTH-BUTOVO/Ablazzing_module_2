package org.javaacademy.geminiwork1;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 17, "London"),
                new Person("Charlie", 25, "New York"),
                new Person("David", 19, "Paris"),
                new Person("Eve", 45, "London"),
                new Person("Frank", 16, "New York"),
                new Person("Aaron", 22, "New York"),
                new Person("Daniel", 28, "Paris")
        );
        List<Order> orders = List.of(
                new Order(1, List.of("Laptop", "Mouse", "Keyboard")),
                new Order(2, List.of("Mouse", "Monitor")),
                new Order(3, List.of("Keyboard", "Desk lamp")),
                new Order(4, List.of("Laptop", "Webcam"))
        );

        // Я написал решение твоей задачи, проверь её. Если есть замечания скажи их или как можно улучшить код.

        //ex1(people);
        //ex2(people);
        //ex3(people);
        //ex4(orders);
        //ex5(people);
        //ex6(people);
    }

    private static void ex6(List<Person> people) {
        // Сгруппировать всех людей по их городу проживания.
        // Для каждой группы (каждого города) собрать список имен людей, проживающих в этом городе.
        // Важно: Список имен для каждого города должен быть отсортирован по алфавиту.
        // Собрать результат в карту Map<String, List<String>>.

        Map<String, List<String>> result = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(result);
    }

    private static void ex5(List<Person> people) {
        // Используй тот же класс Person и тот же список List<Person>:
        // Разделить (партиционировать) всех людей из списка на две группы:
        // Совершеннолетних (возраст 18 и старше).
        // Несовершеннолетних (возраст меньше 18).
        // Собрать результат в карту Map<Boolean, List<Person>>. В этой карте ключом true
        // будет связан список совершеннолетних людей, а ключом false - список несовершеннолетних.

        Map<Boolean, List<Person>> result = people.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() >= 18));
        System.out.println(result);
    }

    private static void ex4(List<Order> orders) {
        // Создай класс Order с полями: int id и List<String> items.
        // Добавь конструктор и геттер для списка товаров (getItems()).
        // Создай список List<Order> с несколькими объектами Order, в каждом из которых свой список товаров.
        // Убедись, что некоторые товары повторяются в разных заказах.
        // Используя Stream API, выполни следующие действия:
        // Получи поток из всех списков товаров во всех заказах.
        // "Разверни" этот поток списков товаров в единый поток отдельных наименований товаров.
        // Оставь в потоке только уникальные наименования товаров.
        // Отсортируй оставшиеся уникальные наименования по алфавиту.
        // Собери отсортированные уникальные наименования в новый список List<String>./

        System.out.println(orders);
        System.out.println("------------------------");

        List<String> res4 = orders.stream()
                .flatMap(e -> e.getItems().stream())
                .distinct()
                .sorted()
                .toList();
        System.out.println(res4);
    }

    private static void ex3(List<Person> people) {
        // Используй тот же класс Person и тот же список List<Person> из предыдущих задач.
        // Сгруппировать всех людей по их городу проживания (снова без фильтрации).
        // Для каждой группы (каждого города) вычислить средний возраст проживающих там людей.
        // Собрать результат в карту Map<String, Double>, где ключом является название города,
        // а значением - средний возраст жителей этого города.

        Map<String, Double> res3 = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getAge)));

        res3.forEach((city, averageAge) -> {
            String formattedAverageAge = String.format("%.2f", averageAge);
            System.out.printf("%s: %S\n", city, formattedAverageAge);
        });
    }

    private static void ex2(List<Person> people) {
        // Используй тот же класс Person и тот же список List<Person> из предыдущих задач.
        // Сгруппировать всех людей (на этот раз без фильтрации по возрасту) по их городу проживания.
        // Для каждого города подсчитать количество людей, проживающих в нем.
        // Собрать результат в карту Map<String, Long>, где ключом является название города,
        // а значением - количество людей в этом городе.

        Map<String, Long> res = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
        //System.out.println(res);
    }

    private static void ex1(List<Person> people) {
        // Создай класс Person с полями: String name, int age, String city. Добавь конструктор и геттеры для этих полей.
        // Создай список List<Person> с несколькими объектами Person (включи людей разного возраста и из разных городов,
        // как взрослых, так и несовершеннолетних).
        // Используя Stream API, выполни следующие действия:
        // Отфильтруй из списка только тех людей, кто старше или равен 18 лет (совершеннолетних).
        // Сгруппируй отфильтрованных людей по их городу проживания.
        // Результатом должна быть карта Map<String, List<Person>>, где ключом является название города,
        // а значением - список совершеннолетних людей из этого города.

        Map<String, List<Person>> res1 = people.stream()
                .filter(e -> e.getAge() >= 18)
                //.sorted(Comparator.comparing(Person::getCity)) // Сортировка не нужна и избыточна .groupingBy она есть.
                .collect(Collectors.groupingBy(Person::getCity));
        //System.out.println(res1);
    }
}
