package org.javaacademy.lesson4.ex1;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        String studentName1 = "Ivanov George";
        String studentName2 = "Petrova Masha";
        Integer score5 = 5;
        Integer score4 = 4;
        Integer score3 = 3;

        HashMap<String, Integer> studentScore = new HashMap<>();
        studentScore.put(studentName1, score5);
        studentScore.put(studentName2, score3);

        studentScore.put(null, 0);
        studentScore.put("", 1);

        System.out.println(studentScore);

        System.out.println(studentScore.get("Ivanov George"));
    }
}
