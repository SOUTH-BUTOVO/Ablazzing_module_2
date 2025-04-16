package org.javaacademy.homework4.ex3_skyscraper;

import java.util.List;

import static org.javaacademy.homework4.ex3_skyscraper.Skyscrapers.*;

public class Runner {
    private static final int OVER_A_KILOMETER = 1_000;

    public static void main(String[] args) {
        /**
         * Задание №3 - Небоскребы, небоскребы, а я...
         * 1. Создать Класс Небоскреб - имя небоскреба, его высота в метрах.
         * 2. Необходимо создать небоскребы:
         * Всемирный торговый центр - 541м
         * Шанхайская башня - 632м
         * Бурдж-Халифа - 828м
         * Международный финансовый центр Пинань - 599м
         * Абрадж аль-Бейт - 601м
         * Всемирный центр Лотте - 555м
         * //
         * 3. Занести небоскребы в List! Дважды положить бурдж халифа в лист.
         * //
         * 4. С помощью стримов:
         * 4.1 Убрать дубликаты и сохранить в новый лист (далее работаем с этим листом).
         * (РАЗНЫЕ СТРИМЫ!)
         * 4.2. Вывести только первые три небоскреба.
         * 4.3. Вывести самый высокий небоскреб.
         * 4.4. Вывести те небоскребы, которые выше километра.
         * Если выше километра нет, то вывести на экран: небоскреба выше километра - нет.
         */

        Skyscraper theWorldTradeCenter = new Skyscraper(TheWorldTradeCenter.getName(),
                TheWorldTradeCenter.getHeight());
        Skyscraper shanghaiTower = new Skyscraper(ShanghaiTower.getName(), ShanghaiTower.getHeight());
        Skyscraper burjKhalifa1 = new Skyscraper(BurjKhalifa.getName(), BurjKhalifa.getHeight());
        Skyscraper burjKhalifa2 = new Skyscraper(BurjKhalifa.getName(), BurjKhalifa.getHeight());
        Skyscraper pinanInternationalFinancialCenter = new Skyscraper(PinanInternationalFinancialCenter.getName(),
                PinanInternationalFinancialCenter.getHeight());
        Skyscraper abrajAlBayt = new Skyscraper(AbrajAlBayt.getName(), AbrajAlBayt.getHeight());
        Skyscraper lotteWorldCenter = new Skyscraper(LotteWorldCenter.getName(), LotteWorldCenter.getHeight());

        List<Skyscraper> skyscraperList = List.of(theWorldTradeCenter, shanghaiTower, burjKhalifa1, burjKhalifa2,
                pinanInternationalFinancialCenter, abrajAlBayt, lotteWorldCenter);

        skyscraperList.forEach(System.out::println);

        List<Skyscraper> resultList = skyscraperList.stream().distinct().toList();
        System.out.println("---------------------------");

        resultList.forEach(System.out::println);
        System.out.println("---------------------------");

        resultList.stream().limit(3).forEach(System.out::println);
        System.out.println("---------------------------");

        resultList.stream().sorted((a, b) -> b.getHeight() - a.getHeight()).limit(1)
                .forEach(e -> System.out.printf("Самый высокий небоскреб: %s", e));
        System.out.println("\n---------------------------");

        boolean hasTallSkyscraper = resultList.stream().anyMatch(e -> e.getHeight() > OVER_A_KILOMETER);
        if (hasTallSkyscraper) {
            resultList.stream()
                    .filter(e -> e.getHeight() > OVER_A_KILOMETER)
                    .forEach(e -> System.out.printf("Небоскреба выше километра: %s", e));
        } else {
            System.out.println("Небоскреба выше километра - нет");
        }
        System.out.println("---------------------------");
    }
}
