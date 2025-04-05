package org.javaacademy.homework2.movers;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class MoversInBulgaria {
    private static final int SIZE_UNLOADING_TAPE = 10;
    Scanner scanner;

    {
        try {
            scanner = new Scanner(Path.of("resources/luggage.csv").toFile());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void unloadingTape() {
        scanner.nextLine();
        ArrayBlockingQueue<String> luggage = new ArrayBlockingQueue<>(SIZE_UNLOADING_TAPE);

        while (scanner.hasNextLine()) {
            System.out.println("Начинается загрузка на ленту");
            for (int i = 0; i < SIZE_UNLOADING_TAPE && scanner.hasNext(); i++) {
                luggage.add(scanner.nextLine());
            }
            System.out.println("Лента загружена, начинается выдача багажа.");
            baggageClaim(luggage);
        }
        System.out.println("Багажа больше нет и лента пустая.");
    }

    private void baggageClaim(ArrayBlockingQueue<String> luggage) {
        while (!luggage.isEmpty()) {
            for (int i = 0; i < luggage.size(); i++) {
                System.out.println(luggage.poll() + "\tВыдан");
            }
        }
        System.out.println("Лента пустая, закончена выдача багажа");
    }
}