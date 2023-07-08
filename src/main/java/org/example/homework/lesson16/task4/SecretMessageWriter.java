package org.example.homework.lesson16.task4;

import java.io.FileWriter;
import java.io.IOException;

public class SecretMessageWriter {
    private static final String TEXT = "Lyova s Mogilyova";
    private static final String FILE_PATH = "src/main/java/org/example/homework/lesson16/task4/image.jpeg";

    public static void write() {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
            fileWriter.write("\n");
            fileWriter.write(TEXT);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
