package org.example.homework.lesson16.task1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
Task 1
Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл
 */
public class ArrayOutput {
    private static final String FILE_PATH = "src/main/java/org/example/homework/lesson16/task1/arrayOutput.txt";

    public static void main(String[] args) throws IOException {
        int[] array = {34, 23, 5, 76, 3, 25, 87, 56};

        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            String textArray = Arrays.toString(array);
            bos.write(textArray.getBytes());

            bos.flush();

        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
