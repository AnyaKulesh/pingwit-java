package org.example.homework.lesson12.task1;

/*
Task 1
Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.

 */
//+
public class Engineering {
    public static void main(String[] args) {
        String str = "Engineering";
        splitWord(str, 6, 7);

        String str2 = "Ecosystem";
        splitWord(str2, 3, 3);
    }

    static void splitWord(String word, int firstWordEnding, int secondWordStarting) {
        String firstWord = word.substring(0, firstWordEnding);
        String secondWord = word.substring(secondWordStarting);
        System.out.println(word + " divided into " + firstWord + " and " + secondWord);
    }
}
