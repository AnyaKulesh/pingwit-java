package org.example.practice.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("counter = " + Person.counter);

        Person firstPerson = new Person();
        firstPerson.displayInfo();

        Person secondPerson = new Person("Vasya", 20);
        secondPerson.displayInfo();

        Person thirdPerson = new Person("Pupa", 35);
        thirdPerson.displayInfo();

        int[] array = {1, 2, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(array);

        System.out.println(firstPerson);

        String [] strings = {"Person1", "Person2"};
        Person [] persons = {
                new Person( "eddgdf", 78),
                new Person(),
                new Person("sanka",55)
        };
        Person[] otherPersons = new Person[2];
        otherPersons[0] = new Person();
        otherPersons[1] = new Person("popka", 19);

        System.out.println(Arrays.toString(otherPersons));
    }
}
