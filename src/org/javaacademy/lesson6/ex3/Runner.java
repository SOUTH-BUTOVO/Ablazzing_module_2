package org.javaacademy.lesson6.ex3;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        MathOperation sum1 = (num1, num2) -> num1 + num2;
        MathOperation sum2 = Double::sum;
        System.out.println(sum2.makeOperation(2, 3));

        MathOperation subtract1 = (num1, num2) -> num1 - num2;
        MathOperation subtract2 = MathOperation::subtract;
        System.out.println(subtract2.makeOperation(11, 3));

        MathOperation multiply1 = (num1, num2) -> num1 * num2;
        MathOperation multiply2 = MathOperation::multiply;
        System.out.println(multiply1.makeOperation(5, 3));

        MathOperation divide1 = (num1, num2) -> num1 / num2;
        MathOperation divide2 = MathOperation::divide;
        System.out.println(divide2.makeOperation(12, 3));

        NumberChecker isEvenCheck1 = NumberChecker::verify;
        NumberChecker isEvenCheck2 = (num) -> num % 2 == 0;
        Predicate<Double> isEvenCheck3 = (num) -> num % 2 == 0;
        Predicate<Double> isEvenCheck4 = NumberChecker::verify;
        System.out.printf("Число положительное - %s\n", isEvenCheck4.test(10d) ? "Да" : "Нет");

        NumberChecker checkBigger = NumberChecker::verifyBigger;
        System.out.printf("Число больше 10 - %s\n", checkBigger.check(8) ? "Да" : "Нет");

        Something met = Something::refMethod;
        met.prt();
    }
}
