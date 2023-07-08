package org.example.practice.lesson16;

import java.io.IOException;

public class Main {
    private static final String FILE_PATH = "src/main/java/org/example/homework/lesson16/task4/image.jpeg";

    public static void main(String[] args) {
        try (SecretMessageReader smr = new SecretMessageReader(FILE_PATH)) {
            System.out.println(smr.read());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
