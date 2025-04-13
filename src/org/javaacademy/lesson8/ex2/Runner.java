package org.javaacademy.lesson8.ex2;

import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parent parent1 = new Parent(List.of(new Child("Петр", 15), new Child("Федор", 10)));
        Parent parent2 = new Parent(List.of(new Child("Анна", 2), new Child("Мария", 18)));

        List<Parent> parentList = List.of(parent1, parent2);
        List<Child> children = parentList.stream()
                .flatMap(e -> e.getChildList().stream())
                .sorted(Comparator.comparingInt(Child::getAge)).toList();
        System.out.println(children);
    }
}
