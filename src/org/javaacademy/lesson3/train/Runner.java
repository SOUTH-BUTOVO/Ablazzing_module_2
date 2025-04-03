package org.javaacademy.lesson3.train;

public class Runner {
    public static void main(String[] args) {
        Wagon wagon1 = new Wagon(WagonType.PASSENGER, 1);
        Train train = new Train(wagon1);
        Wagon wagon2 = new Wagon(WagonType.PASSENGER, 2);
        train.addTail(wagon2);
        Wagon wagon3 = new Wagon(WagonType.VODKA, 3);
        train.addTail(wagon3);
        Wagon wagon4 = new Wagon(WagonType.PASSENGER, 4);
        train.addTail(wagon4);
        Wagon wagon5 = new Wagon(WagonType.WOOD, 5);
        train.addTail(wagon5);
        Wagon wagon6 = new Wagon(WagonType.PASSENGER, 6);
        train.addHead(wagon6);
        System.out.println(train.getFromHeadByIndex(2));
        System.out.println(train.getFromTailByIndex(2));
    }
}
