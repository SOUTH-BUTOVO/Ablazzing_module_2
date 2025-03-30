package org.javaacademy.lesson1.ex2;

import org.javaacademy.lesson1.ex2.input.KeyBoard;
import org.javaacademy.lesson1.ex2.input.Mouse;
import org.javaacademy.lesson1.ex2.output.Monitor;
import org.javaacademy.lesson1.ex2.output.Tv;

public class Runner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        Tv tv = new Tv();
        Monitor monitor = new Monitor();

        Computer<KeyBoard, Tv> computer = new Computer<>(keyBoard, tv);

        computer.input();
        KeyBoard inputObject = computer.getInputObject();
        inputObject.escape();

        System.out.println(inputObject);
        System.out.println("========================");

        Tv outputObject = computer.getOutputObject();
        computer.show();
        outputObject.show();
        outputObject.makeSound();
    }
}
