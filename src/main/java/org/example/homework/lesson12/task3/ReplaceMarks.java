package org.example.homework.lesson12.task3;

/*
Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
 */
public class ReplaceMarks {
    public static void main(String[] args) {
        String str = "Green. red. blue. yellow";
        String replaced = replace(str, ".", ",");
        System.out.println(replaced);
    }

    static String replace(String str, String target, String substring) {
        return str.replace(target, substring);
    }
}
