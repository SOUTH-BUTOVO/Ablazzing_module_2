package org.javaacademy.lesson7.call_center;

@FunctionalInterface
public interface CallScript {

    void readScript();

    static void sellCreditCard() {
        System.out.println("Здравствуйте, меня зовут Петр, я из Альфа-банк!");
        System.out.println("Предлагаю Вам оформить кредитную карту.");
    }

}
