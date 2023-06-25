package org.example.homework.lesson12.task7;

/*
Есть массив строк, вывести на экран все строки, длина которых больше 5 символов
 */
public class DisplayBigStrings {
    private static final String[] WORDS = {"monkey", "crocodile", "rat", "dog", "rabbit"};
    private static final int LENGTH_LIMIT = 5;

    public static void main(String[] args) {
        displayStrings(WORDS, LENGTH_LIMIT);
    }

    static void displayStrings(String [] words, int lengthLimit){
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > lengthLimit) {
                System.out.println(words[i]);
            }
        }
    }
}
