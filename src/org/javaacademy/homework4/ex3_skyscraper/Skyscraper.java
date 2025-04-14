package org.javaacademy.homework4.ex3_skyscraper;

public class Skyscraper {
    private final String name;
    private final int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
