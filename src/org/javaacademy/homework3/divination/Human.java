package org.javaacademy.homework3.divination;

public class Human {
    private Integer age;
    private Integer height;

    public Human(Integer age, Integer height) {
        this.age = age;
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Human{" +"age=" + age +", height=" + height + '}';
    }
}
