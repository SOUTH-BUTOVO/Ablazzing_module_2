package org.javaacademy.homework1.zoo;

public class Zoo <T extends Animal, D extends Animal, B extends Animal> {
    private T animal1;
    private D animal2;
    private B animal3;

    public Zoo(T animal1, D animal2, B animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }
    
    public T getAnimal1() {
        return animal1;
    }

    public D getAnimal2() {
        return animal2;
    }

    public B getAnimal3() {
        return animal3;
    }
}
