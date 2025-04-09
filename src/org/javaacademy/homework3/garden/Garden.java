package org.javaacademy.homework3.garden;

import java.util.function.Supplier;

@FunctionalInterface
public interface Garden<T extends Fruits> extends Supplier<T> {
}
