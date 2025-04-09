package org.javaacademy.homework3;

import org.javaacademy.homework3.divination.Divination;
import org.javaacademy.homework3.divination.Human;
import org.javaacademy.homework3.ex4.Ruler;
import org.javaacademy.homework3.ex4.animal.Animal;
import org.javaacademy.homework3.ex4.boat.Boat;
import org.javaacademy.homework3.feedback.Feedback;
import org.javaacademy.homework3.fire.Burning;
import org.javaacademy.homework3.fire.Uranium;
import org.javaacademy.homework3.fire.Wood;
import org.javaacademy.homework3.garden.Apple;
import org.javaacademy.homework3.garden.Apricot;
import org.javaacademy.homework3.garden.Garden;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        //Задание №1: Сад
        //Создать два класса, которые являются фруктами (намек на еще один класс): яблоко, абрикос.
        //(Без полей и методов).
        //Создать функциональный интерфейс сад, который умеет выращивать ФРУКТ и всех наследников фрукта.
        //Метод ничего не принимает.
        //Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
        //Яблочная ферма должна отдавать яблоко(не фрукт!), абрикосовая - абрикос(не фрукт!).
        Garden<Apple> appleGarden = Apple::new;
        Garden<Apricot> apricotGarden = Apricot::new;
        System.out.println(appleGarden.get());
        System.out.println(apricotGarden.get());

        //Задание №2: Поиск пары с помощью гадания
        //Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст, рост),
        //возвращает да - если (возраст + рост) больше 210, нет - если меньше или равно
        Divination<String> divinationChamomile = name -> name.length() % 2 == 0;
        System.out.println(divinationChamomile.test("Oleg") ? "Да" : "Нет");
        Predicate<Human> divination = human -> human.getAge() + human.getHeight() > 210;
        System.out.println(divination.test(new Human(30, 180)) ? "Да" : "Нет");

        //Задание №3: Гори ясно!
        //Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
        //любого типа.
        //Создать класс уран (без атрибутов и методов)
        //Создать класс дерево (без атрибутов и методов)
        //Создать с помощью лямбд выражений:
        //атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
        //костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
        Burning<Uranium> atomicReactor = uran -> System.out.println("зеленый свет вокруг!");
        Burning<Wood> woodBurning = wood -> System.out.println("желто-красный свет вокруг!");
        atomicReactor.accept(new Uranium());
        woodBurning.accept(new Wood());

        //Задание №4: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать класс животное (длина тела, длина хвоста)
        //Создать класс лодка(длина)
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка, возвращает длину лодки
        //Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста
        Ruler<Boat> lengthBoat = boat -> boat.getLength();
        Ruler<Animal> lengthAnimal = animal -> animal.getLengthBody() + animal.getLengthTail();
        System.out.printf("Длинна лодки: %s\n", lengthBoat.apply(new Boat(160)));
        System.out.printf("Общая длинна животного: %s\n", lengthAnimal.apply(new Animal(25, 7)));

        //Задание №5: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime) - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
        //Создать коллекцию, которая хранит отсортированные отзывы по:
        // 1.лайкам
        // 2.(Если лайки совпадают) дата + время отзыва
        // 3.(Если лайки и дата + время отзыва совпадают) id

        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
        LocalDateTime dateFeedback1 = LocalDateTime.of(2024, 01, 25, 13, 37);
        LocalDateTime dateFeedback2 = LocalDateTime.of(2024, 01, 25, 16, 37);
        LocalDateTime dateFeedback4 = LocalDateTime.of(2024, 01, 25, 13, 37);
        LocalDateTime dateFeedback3 = LocalDateTime.of(2024, 01, 25, 13, 37);

        Feedback feedback1 = new Feedback(1, "отличный товар", 200, dateFeedback1);
        Feedback feedback2 = new Feedback(2, "так себе товар", 100, dateFeedback2);
        Feedback feedback4 = new Feedback(4, "плохой товар", 100, dateFeedback4);
        Feedback feedback3 = new Feedback(3, "плохой товар", 10, dateFeedback3);

        Comparator<Feedback> byLikes = (like1, like2) -> like1.getCount() - like2.getCount();
        Comparator<Feedback> byDateTime = Comparator.comparing(Feedback::getDateTime);
        Comparator<Feedback> byId = Comparator.comparingInt(Feedback::getId);

        Comparator<Feedback> comparator = byLikes.thenComparing(byDateTime).thenComparing(byId);

        TreeSet<Feedback> feedbacks = new TreeSet<>(comparator);
        feedbacks.add(feedback1);
        feedbacks.add(feedback2);
        feedbacks.add(feedback4);
        feedbacks.add(feedback3);

        for (Feedback feedback : feedbacks) {
            System.out.println(feedback);
        }
    }
}
