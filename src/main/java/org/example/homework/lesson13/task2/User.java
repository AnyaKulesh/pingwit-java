package org.example.homework.lesson13.task2;

public class User {
    private String name;
    private int age;
    private Cart cart;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cart getCart() {
        return cart;
    }
}
