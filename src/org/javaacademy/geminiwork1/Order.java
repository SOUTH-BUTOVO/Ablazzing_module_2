package org.javaacademy.geminiwork1;

import java.util.List;

public class Order {
    private int id;
    private List<String> items;

    public Order(int id, List<String> items) {
        this.id = id;
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", items=" + items + '}';
    }
}
