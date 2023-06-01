package org.example.homework.lesson6;

/*
Task 2
Создайте класс, у которого будут поля имя и возраст.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста.
Добавьте в класс блок инициализации, который будет выводить на экран сообщение о том, что создали новый экземпляр класса.

Task 4
Классу из 'Task 2' добавьте статическое приватное поле text = "Hello from static".
В другом классе, с методом main создайте несколько экземпляров класса из 'Task 2'. В одном из экземпляров измените значение
поля 'text' и затем выведите на экран поле 'text' у всех созданных объектов.
Если результат вас удивил, пересмотрите лекцию про static поля в классах
 */
//+
public class Pet {
    private static String text = "Hello from static";

    {
        System.out.println("Created a new pet instance");
    }

    String name;
    int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", text=" + text +
                '}';
    }

    void updateText(String text) {
        Pet.text = text;
    }
}
