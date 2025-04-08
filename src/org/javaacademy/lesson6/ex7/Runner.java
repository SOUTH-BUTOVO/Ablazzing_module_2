package org.javaacademy.lesson6.ex7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Advert advertTv = new Advert("Продаётся телевизор", BigDecimal.valueOf(10_000));
        Advert advertBicycle = new Advert("Продаётся велосипед", BigDecimal.valueOf(15_000));
        Advert advertFreezer = new Advert("Продаётся холодильник", BigDecimal.valueOf(8_000));

        ArrayList<Advert> adverts = new ArrayList<>(List.of(advertTv, advertBicycle, advertFreezer));
        Comparator<Advert> comparator = (a1, a2) -> a1.getPrice().compareTo(a2.getPrice());
        //Comparator<Advert> comparator = Comparator.comparing(Advert::getPrice);
        adverts.sort(comparator.reversed());
        System.out.println(adverts);
    }
}
