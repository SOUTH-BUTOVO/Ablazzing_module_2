package org.javaacademy.lesson7.call_center;

public class Runner {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

//        CallScript sellCreditCard = () -> {
//            System.out.println("Здравствуйте, меня зовут Петр, я из Альфа-банк!");
//            System.out.println("Предлагаю Вам оформить кредитную карту.");
//        };

        CallScript sellCreditCard = CallScript::sellCreditCard;
        sellCreditCard.readScript();
        System.out.println("--------------------------------");

        CallScript sellMobileTariff = () -> {
            System.out.println("Здравствуйте, меня зовут Петр, я из MTS!");
            System.out.println("Предлагаю Вам воспользоваться нашим новым и выгодным тарифом на связь.");
        };

        callCenter.call(sellMobileTariff);
    }
}
