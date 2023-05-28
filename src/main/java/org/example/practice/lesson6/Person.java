package org.example.practice.lesson6;

public class Person {

    static int counter;
    String name;
    int age;

    static {
        counter = 10;
        System.out.println("Static init block");
    }
    {
        System.out.println("Created new instance");
    }

    public Person() {
        this.name = "Noname";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("name = " + name + ", age = " + age + ", counter = " + counter);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
