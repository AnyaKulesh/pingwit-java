package org.example.homework.lesson12.task4;

/*
Task 4
Есть текст:
“While major gameplay components are already in place and functioning,
players help is needed to add some of the smaller features and content.
Of course polishing the overall experience is important at the same time.
Game has been extensively tested in closed group, but it is always important to hear fresh suggestions
from larger crowd that come from various gaming backgrounds.
Plan is to make the game as good as possible but without compromising the core idea.”

Нужно узнать содержит ли текст слова “alert”, “add”, “good”, “plan” и какое кол-во.

 */
public class FindWords {

    private static final String TEXT = "While major gameplay components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";
    private static final String[] WORDS = {"alert", "add", "good", "plan", "is"};

    public static void main(String[] args) {
        FindWords findWords = new FindWords();
        findWords.displayWordRate(TEXT, WORDS);

    }

    public void displayWordRate(String text, String[] words) {
        for (String word : words) {
            int i = text.indexOf(word);
            int count = 0;
            while (i != -1) {
                count++;
                i = text.indexOf(word, i + 1);
            }

            System.out.println(word + ":" + count);
        }
    }
}
