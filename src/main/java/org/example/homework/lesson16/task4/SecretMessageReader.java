package org.example.homework.lesson16.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//+
public class SecretMessageReader {
    private static final String FILE_PATH = "src/main/java/org/example/homework/lesson16/task4/image.jpeg";

    public static String read() {
        String result = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String text = bufferedReader.readLine();
            while (text != null) {
                result = text;
                text = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        return result;
    }

}
