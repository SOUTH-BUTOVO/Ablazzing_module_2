package org.javaacademy.lesson10.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException,
            InvocationTargetException, NoSuchMethodException, InstantiationException {
        //Cat cat = new Cat("Барсик");
        //Class<Cat> catClass = Cat.class;
        //System.out.println(Arrays.toString(catClass.getDeclaredFields()));

        //Cat cat = createCat("Барсик");

        Class<Cat> catClass = Cat.class;
        Constructor<?>[] constructors = catClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));
        Constructor<Cat> catConstructor = catClass.getDeclaredConstructor(String.class);
        catConstructor.setAccessible(true);
        Cat cat = catConstructor.newInstance("Барсик");

        for (Field field : catClass.getDeclaredFields()) {
            System.out.println(field.getName());
            field.setAccessible(true);
            Object catName = field.get(cat);
            System.out.println(catName);
        }

        for (Method method : catClass.getDeclaredMethods()) {
            System.out.println(method.getName());
            method.setAccessible(true);
            method.invoke(cat);
        }
        System.out.println("---------");

        Method says = catClass.getDeclaredMethod("say");
        System.out.println(says.getName());
        says.setAccessible(true);
        says.invoke(cat);
    }
}
