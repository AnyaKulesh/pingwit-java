package org.example.homework.lesson16.task4;
/*
Task 4
Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
Затем это сообщение нужно прочитать из файла и вывести на экран
 */
//убирай пустые строки, а так +
public class Main {

    public static void main(String[] args) {
        SecretMessageWriter.write();
        System.out.println(SecretMessageReader.read());

    }
}
