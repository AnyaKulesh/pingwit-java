package org.example.homework.lesson12.task2;

/*
Есть слово “alucard”. Нужно изменить порядок букв на обратный.
 */
//+
public class Alucard {

    private static final String WORD = "alucard";

    public static void main(String[] args) {
        String reversed = reverse(WORD);
        System.out.println(reversed);
    }

    static String reverse(String toReverse) {
        return new StringBuilder(toReverse).reverse().toString();
    }
}
