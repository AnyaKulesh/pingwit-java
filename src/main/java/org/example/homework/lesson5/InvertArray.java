package org.example.homework.lesson5;



import java.util.Arrays;



/*
Task 5
Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
 */
public class InvertArray {
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4};
        invertArray(array);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int [] array, int i, int j){
        int a = array [i];
        array [i] = array [j];
        array [j] = a;
    }
    static void invertArray(int[]array){
        int i = 0;
        int j = array.length - 1;
        while (i < j){
             swap(array,i,j);
             i++;
             j--;
        }
    }
}
