package org.javaacademy.lesson1.ex3.ex4;

public abstract class Car {
    protected boolean isClean = true;

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
