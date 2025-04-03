package org.javaacademy.lesson3.train;

public class Wagon {
    private WagonType wagonType;
    private int number;
    private Wagon prev;
    private Wagon next;

    public Wagon(WagonType wagonType, int number) {
        this.wagonType = wagonType;
        this.number = number;
    }

    public Wagon(WagonType wagonType, Wagon prev) {
        this.wagonType = wagonType;
        this.prev = prev;
    }

    public Wagon(WagonType wagonType, Wagon prev, Wagon next) {
        this.wagonType = wagonType;
        this.prev = prev;
        this.next = next;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    public Wagon getPrev() {
        return prev;
    }

    public Wagon getNext() {
        return next;
    }

    public void setPrev(Wagon prev) {
        this.prev = prev;
    }

    public void setNext(Wagon next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Wagon{" + "number=" + number + '}';
    }
}
