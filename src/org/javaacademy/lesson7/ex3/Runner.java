package org.javaacademy.lesson7.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<String> names = List.of("Петр", "Иван", "Олег", "Михаил", "Ян");
        Stream<String> stream = names.stream();

        Stream<String> stream1 = names.stream();
        Stream<List<String>> stream2 = Stream.of(names);
        Stream<String> stream3 = Stream.of(new String[]{"Петр", "Иван", "Олег"});

        // .forEach - Применение к каждому элементу стрима какого то действия.
        ArrayList<String> newNames = new ArrayList<>();
        stream.forEach(newNames::add);
        newNames.stream().filter(name -> name.length() > 4).forEach(System.out::println);

        // .count - Количество элементов внутри стрима.
        System.out.println(names.stream().count());

        // .anyMatch - Есть ли, хотя бы один элемент, удовлетворяющий условие.
        System.out.println(names.stream().anyMatch(Predicate.isEqual("Олег"))
                ? "Да, есть это имя!" : "Нет, этого имени.");

        // .allMatch - Все элементы соответствуют условию.
        System.out.println(names.stream().allMatch(name -> name.length() >= 4)
                ? "Да, длинна имён больше или ровна!" : "Нет, длинна имён меньше.");

        // .noneMatch - Ни один элемент не совпадает.
        System.out.println(names.stream().noneMatch(name -> name.equals("Олег"))
                ? "Совпадений не найдено." : "Есть совпадение!");
        System.out.println(names.stream().anyMatch(letter -> letter.toLowerCase().contains("м"))
        ?  "Есть совпадение с буквой!" : "Совпадений с буквой не найдено.");

        // Получить первый элемент.
        System.out.println(names.stream().findFirst().get());

        // Получить самое длинное имя.
        Optional<String> maxName = names.stream().max((n1, n2) -> n1.length() - n2.length());
        System.out.println(maxName);
        System.out.printf("Самое длинное имя в коллекции: %s\n", maxName.orElse("Коллекция пустая"));

        // Получить самое короткое имя.
        Optional<String> minName = names.stream().min(Comparator.comparingInt(String::length));
        System.out.printf("Самое короткое имя в коллекции: %s\n", minName.orElse("Коллекция пустая"));

        // Получение одного сгруппированного значения
        Optional<String> reduce = names.stream().reduce("%s, %s"::formatted);
        String result = names.stream().reduce("", "%s, %s"::formatted);
//        Optional<String> reduce = names.stream().reduce((a, b) -> "%s, %s".formatted(a, b));
//        Optional<String> reduce = names.stream().reduce(String::concat);
        System.out.printf("Результат объединения строк: %s\n", reduce.orElse("Коллекция пустая"));
        System.out.printf("Результат объединения строк: %s\n", result);

        List<Integer> nums = List.of(10, 20, 30);
//        Optional<Integer> res = nums.stream().reduce(Integer::sum);
        Integer res = nums.stream().reduce((a, b) -> a + b).orElseThrow();
        System.out.println(res);
    }
}
