package org.example.lesson3;

/*

Task 8
Нарисуйте оставшиеся 2 треугольника.
Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
   *  (1)
  **
 ***
****

****  (2)
 ***
  **
   *

 */
public class Triangles {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i <= 4; i++) {
            String line = "";
            for (int a = 1; a <= i; a++) {
                line += c;
            }
            System.out.println(line);
        }
        for (int i = 4; i >= 1; i--) {
            String line = "";
            for (int a = 1; a <= i; a++) {
                line += c;
            }
            System.out.println(line);
        }
        for (int i = 1; i <= 4; i++) {
            String line = "";
            for (int q = 1; q <= 4 - i; q++) {
                line += ' ';
            }
            for (int a = 1; a <= 2 * i; a++) {
                line += c;
            }
            System.out.println(line);
        }
        for (int i = 4; i >= 1; i--) {
            String line = "";
            for (int q = 1; q <= 4 - i; q++) {
                line += ' ';
            }
            for (int a = 1; a <= 2 * i; a++) {
                line += c;
            }
            System.out.println(line);
        }
    }
}
