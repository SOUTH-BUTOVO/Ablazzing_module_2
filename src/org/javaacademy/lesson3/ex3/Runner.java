package org.javaacademy.lesson3.ex3;

import java.util.concurrent.LinkedBlockingDeque;

public class Runner {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Бабушка №1");
        deque.add("Бабушка №2");
        System.out.println("Очередь до принятия пациента");
        System.out.println(deque);
        deque.addFirst("Наглый человек");
        System.out.println(deque);
        System.out.println("Открывается кабинет");
        System.out.println("Заходит пациент: " + deque.pollLast());
        System.out.println("Очередь после захода пациента\n" + deque);
        deque.addFirst(deque.pollLast());
        System.out.println(deque);
    }
}
