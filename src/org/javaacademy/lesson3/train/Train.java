package org.javaacademy.lesson3.train;

public class Train {
    private WagonType wagonType;
    private Wagon first;
    private Wagon last;

    public Train(Wagon wagon) {
        this.wagonType = wagon.getWagonType();
        this.first = wagon;
        this.last = wagon;
    }

    public void addTail(Wagon newWagon) {
        this.last.setNext(newWagon);
        newWagon.setPrev(this.last);
        this.last = newWagon;
    }

    public void addHead(Wagon newWagon) {
        this.first.setPrev(newWagon);
        newWagon.setNext(this.first);
        this.first = newWagon;
    }

    public Wagon getFromHeadByIndex(int index) {
        Wagon temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public Wagon getFromTailByIndex(int index) {
        Wagon temp = last;
        for (int i = 0; i < index; i++) {
            temp = temp.getPrev();
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Train{" + "wagonType=" + wagonType + ", first=" + first + ", last=" + last + '}';
    }
}
