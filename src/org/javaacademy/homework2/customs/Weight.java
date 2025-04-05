package org.javaacademy.homework2.customs;

public enum Weight {
    LIGHT("Лёгкий", null),
    AVERAGE("Средний", 5),
    HEAVY("Тяжёлый", 10);

    private String name;
    private Integer weightLimit;

    Weight(String name, Integer weightLimit) {
        this.name = name;
        this.weightLimit = weightLimit;
    }

    public String getName() {
        return name;
    }

    public Integer getWeightLimit() {
        return weightLimit;
    }
}
