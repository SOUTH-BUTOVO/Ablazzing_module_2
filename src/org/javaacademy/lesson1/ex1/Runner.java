package org.javaacademy.lesson1.ex1;

import org.javaacademy.lesson1.ex1.product.Bicycle;
import org.javaacademy.lesson1.ex1.product.Phone;
import org.javaacademy.lesson1.ex1.product.Product;
import org.javaacademy.lesson1.ex1.product.Tomato;
import org.javaacademy.lesson1.ex1.shop.BicycleShop;
import org.javaacademy.lesson1.ex1.shop.PhoneShop;
import org.javaacademy.lesson1.ex1.shop.ProductShopGeneric;

public class Runner {
    public static void main(String[] args) {
        BicycleShop bicycleShop = new BicycleShop();
        bicycleShop.buy(new Bicycle(7_000));
        Product bicycle = bicycleShop.sell(10_000);
        System.out.println(bicycle);

        PhoneShop phoneShop = new PhoneShop();
        phoneShop.buy(new Phone(1_000));
        Product phone = phoneShop.sell(2_000);
        if (phone instanceof Phone phone1) {
            phone1.call();
        }

        ProductShopGeneric<Phone> phoneShop2 = new ProductShopGeneric<>();
        phoneShop2.buy(new Phone(3_000));
        Phone phone2 = phoneShop2.sell(5_000);
        phone2.call();
        System.out.println(phone2);

        ProductShopGeneric<Tomato> tomatoProductShopGeneric = new ProductShopGeneric<>();
        tomatoProductShopGeneric.buy(new Tomato(150));
        Tomato tomato = tomatoProductShopGeneric.sell(300);
        System.out.println(tomato.getClass());
    }
}
