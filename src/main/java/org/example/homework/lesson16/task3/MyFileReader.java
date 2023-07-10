package org.example.homework.lesson16.task3;

import org.example.homework.lesson16.task2.FileOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Прочитать файл из Task_2 и вывести на экран содержимое
 */
//+
public class MyFileReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FileOutput.getFilePath()))) {
            String text = bufferedReader.readLine();
            while (text != null){
                System.out.println(text);
                text = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
