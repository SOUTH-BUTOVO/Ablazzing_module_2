package org.javaacademy.homework4.ex2_howletters;

import java.util.List;

public class Runner {
    private static final char SEARCH_LATTER = 'о';

    public static void main(String[] args) {

        // Задание №2 - Сколько здесь "о" ?
        // 1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
        // 2. Создать стрим у набора
        // 2.1 Посчитать количество букв "о" в одном слове
        // 2.2 Посчитать сумму количества букв "о" во всех словах из набора
        // 2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
        //
        // Ожидаемый результат:
        // 6

        List<String> list = List.of("тон", "тополь", "боль", "рой", "стройка");

        list.stream()
                .peek(word -> {
                    long count = word.chars().filter(latter -> latter == SEARCH_LATTER).count();
                    System.out.printf("Количество букв \"о\" в слове: %s = %s\n", word, count);
                })
                .forEach(e -> System.out.print(""));

        int res = list.stream().mapToInt(latter -> (int) latter.chars()
                      .filter(l -> l == SEARCH_LATTER).count())
                      .sum();
        System.out.println("Сумма букв 'о' в коллекции = " + res);
    }
}
