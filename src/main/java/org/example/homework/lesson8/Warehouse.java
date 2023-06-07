package org.example.homework.lesson8;

import java.util.Arrays;

/*
Task 1
Создать класс Warehouse, внутри которого массив класса Box (с любыми полями - например name, weight - сделать его через record).
Массив должен быть immutable
При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после этого нельзя.
В классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
также должен быть метод getArray() - который возвращает массив и переопределен метод toString()

 */
public class Warehouse {
    private Box[] boxes;
    private int index;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes.clone();
        this.index = 0;
    }

    public Box[] getBoxes() {
        return boxes.clone();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }

    public Box next() {
        Box result = boxes[index++];
        if (index == boxes.length) {
            index = 0;
        }
        return result;
    }
}
