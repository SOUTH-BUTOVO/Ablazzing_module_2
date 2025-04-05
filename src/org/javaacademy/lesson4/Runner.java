package org.javaacademy.lesson4;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Иван", "Иванов", 2020);
        Child child2 = new Child("Иван", "Иванов", 2020);

        System.out.println(child1.equals(child2));
        System.out.println("=================");

        String a = null;
        String b = "null";
        String c = "";
//        a.equals(b); // NPE
//        System.out.println(Optional.of(a).equals(b)); // NPE
        System.out.println(Optional.ofNullable(a).isEmpty());
        System.out.println(Objects.equals(a, null));
        System.out.println("=================");

        Child child3 = new Child("Миша", "Козлов", 2021);
        Child child4 = new Child("Сергей", "Топтунов", 2022);
        Child child5 = new Child("Аня", "Петрова", 2020);
        Child child6 = new Child("Маша", "Сверидова", 2025);

//        List<Child>[] groups = new List[3];
//        groups[0] = List.of(child1, child5);
//        groups[1] = List.of(child3);
//        groups[2] = List.of(child4);
//
//        //System.out.println(Arrays.toString(groups));
//        int i = 1;
//        for (List<Child> group : groups) {
//            System.out.printf("Группа %s:%n", i);
//            System.out.println(group);
//            System.out.println("-------------");
//            i++;
//        }

        ChildGarden childGarden = new ChildGarden(3);
        childGarden.addChildInGroup(child1);
//        childGarden.addChildInGroup(child2);
        childGarden.addChildInGroup(child3);
        childGarden.addChildInGroup(child4);
        childGarden.addChildInGroup(child5);
        childGarden.addChildInGroup(child6);
        int i = 1;
        for (List<Child> group : childGarden.getGroups()) {
            System.out.printf("Группа %s:%n", i);
            System.out.println(group);
            System.out.println("-------------");
            i++;
        }
    }
}
