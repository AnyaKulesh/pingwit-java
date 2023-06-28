package org.example.homework.lesson13.task2;
/*
Task 2
Создайте простой онлайн магазин используя ООП.
Есть класс абстрактный класс Product, который имеет поля name, price, quantity.
В магазине, например, есть 3 продукта: Apple (у него еще есть доп поле - цвет),
Computer(доп поля -  String processor, int ram), Coffee (+ String type).
Есть класс Cart который имеет методы addProduct, removeProduct, getTotalPrice, getTotalQuantity, printCart
Есть класс User который имеет поля name, age, cart.

 */
public class Main {
    public static void main(String[] args) {
        User sasha = new User("Sasha",30);
        sasha.getCart().addProduct(new Apple("Macintosh", 3.45,4,Colour.RED));
        sasha.getCart().addProduct(new Apple( "Antonovka",5.0,7,Colour.GREEN));
        sasha.getCart().addProduct(new Coffee("Hurricane", 60, 2,"Arabica"));
        sasha.getCart().addProduct(new Computer("MacBook Pro",3000,1, "M1", 1024));

        sasha.getCart().printCart();
        System.out.println(sasha.getName() + " has products with total price: " + sasha.getCart().getTotalPrice());
        System.out.println(sasha.getName() + " has " + sasha.getCart().getTotalQuantity() + " products");

    }

}
