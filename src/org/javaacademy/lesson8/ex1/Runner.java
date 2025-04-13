package org.javaacademy.lesson8.ex1;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        // Отфильтровать коллекцию по условию.
        numbers.stream()
                .filter(e -> {
                    System.out.println("Тут число: " + e);
                    return e > 6;
                }).forEach(System.out::println);
        System.out.println("----------");

        // Удалить дубликаты.
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println("----------");

        // Пропустить н элементов.
        numbers.stream().skip(5).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");

        // Получить первые н элементов
        numbers.stream().limit(5).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");

        // Преобразовать в другой тип.
        numbers.stream()
                .map(e -> String.valueOf(e + "A"))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");

        // Выполнить действие над элементами, изменяет входные данные.
        List<Human> humans = List.of(new Human(20), new Human(30));
        humans.stream().peek(e -> e.setAge(40)).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n----------");
        System.out.println(humans);

        // Устранение вложенности
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        System.out.println(lists);
        System.out.println(lists.get(0));
//        lists.stream().flatMap(e -> e.stream()).forEach(e -> System.out.print(e + "   "));
        List<Integer> listsOf = lists.stream().flatMap(Collection::stream).toList();
        System.out.println(listsOf.get(0));

        // Сортировка.
        List<Integer> unsortedNumbers = List.of(5, 9, 2, 4, 4);
//        Comparator<Integer> comparator = ((a, b) -> b - a);
        Comparator<Integer> comparator = Comparator.reverseOrder();
//        unsortedNumbers.stream().sorted((o1, o2) -> o2 - o1).forEach(System.out::print);
//        unsortedNumbers.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::print);
        unsortedNumbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();
    }
}
