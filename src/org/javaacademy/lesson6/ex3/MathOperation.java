package org.javaacademy.lesson6.ex3;

@FunctionalInterface
public interface MathOperation {

    double makeOperation(double num1, double num2);

    static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
