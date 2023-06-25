package org.example.homework.lesson12.task5;

import java.util.Arrays;

/*
Task 6
Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.

 */
public class WordArray {
    private static final String[] WORDS = {"wallet", "pocket", " Wall", " walk", " sea", " Wedding", "Apple", " Puppe", "wrong"};
    private static final String FIRST_LETTER = "w";

    public static void main(String[] args) {
        String[] newWords = findLetter(WORDS, FIRST_LETTER);
        System.out.println(Arrays.toString(newWords));
    }

    public static String[] findLetter(String[] words, String prefix) {
        int count = 0;
        for (String word : words) {
            if (filter(word, prefix)) {
                count++;
            }
        }
        String[] filtered = new String[count];
        int index = 0;
        for (String word : words) {
            if (filter(word, prefix)) {
                filtered[index] = word;
                index++;
            }
        }
        return filtered;
    }

    public static boolean filter(String word, String prefix) {
        return word.trim().toLowerCase().startsWith(prefix.toLowerCase());
    }
}

