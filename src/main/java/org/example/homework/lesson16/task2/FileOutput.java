package org.example.homework.lesson16.task2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Есть некоторый текст, его нужно записать в файл. Можно использовать одно и то же предложение, запишите его 1000 раз
 */
public class FileOutput {
    private static final String FILE_PATH = "src/main/java/org/example/homework/lesson16/task2/fileOutput.txt";

    public static void main(String[] args) {
        String text = "Hello World!";
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            for (int i = 0; i < 1000; i++) {
                bos.write(text.getBytes());
                bos.write("\n".getBytes());
            }
            bos.write("The end.".getBytes());

            bos.flush();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

    }

    public static String getFilePath() {
        return FILE_PATH;
    }
}
