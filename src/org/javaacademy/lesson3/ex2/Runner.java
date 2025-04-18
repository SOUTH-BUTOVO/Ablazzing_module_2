package org.javaacademy.lesson3.ex2;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class Runner {
    public static void main(String[] args) {
        //LinkedList<String> linkedList = new LinkedList<>();
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
        queue.add("Бабушка №1");
        queue.add("Бабушка №2");
        System.out.println("Очередь до принятия пациента");
        System.out.println(queue);
        System.out.println("Кто первый в очереди!?");
        System.out.println(queue.peek());

        System.out.println("Объявляется приём, заходите!");
        String takeElement = queue.poll();
        System.out.println("Принятый пациент " + takeElement);
        System.out.println("Очередь после принятия пациента " + queue);
    }
}
