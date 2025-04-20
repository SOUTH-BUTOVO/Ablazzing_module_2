package org.javaacademy.homework4.ex3_skyscraper;

import java.util.Objects;

public class Skyscraper {
    private final String name;
    private final int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Skyscraper that = (Skyscraper) object;
        return height == that.height && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString() {
        return "Skyscraper{" + "name='" + name + '\'' + ", height=" + height + '}';
    }
}
