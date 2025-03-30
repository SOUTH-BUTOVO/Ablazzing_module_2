package org.javaacademy.lesson1.ex1.shop;

import org.javaacademy.lesson1.ex1.product.Product;

public abstract class ProductShop {
    private Product product;

    public void buy(Product product) {
        this.product = product;
    }

    public Product sell(double money) {
        if (product == null) {
            throw new RuntimeException("Нет продукта на продажу");
        }
        if (product.getPrice() <= money) {
            Product temp = product;
            product = null;
            return temp;
        }
        throw new RuntimeException("Денег не достаточно для покупки продукта.");
    }
}
