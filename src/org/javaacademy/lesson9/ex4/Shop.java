package org.javaacademy.lesson9.ex4;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private Map<String, Integer> products;

    public Shop(Map<String, Integer> products) {
        this.products = products;
    }

    public void addProduct(String product, Integer count) {
//        products.put(product, products.getOrDefault(product, 0) + count);
        products.merge(product, count, Integer::sum);
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" + "products=" + products + '}';
    }
}
