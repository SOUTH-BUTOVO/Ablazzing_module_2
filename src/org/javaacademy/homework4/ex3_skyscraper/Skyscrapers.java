package org.javaacademy.homework4.ex3_skyscraper;

public enum Skyscrapers {
    TheWorldTradeCenter("Всемирный торговый центр", 541),
    ShanghaiTower("Шанхайская башня", 632),
    BurjKhalifa("Бурдж-Халифа", 828),
    PinanInternationalFinancialCenter("Международный финансовый центр Пинань", 599),
    AbrajAlBayt("Абрадж аль-Бейт", 601),
    LotteWorldCenter("Всемирный центр Лотте", 555);

    private String name;
    private int height;

    Skyscrapers(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
