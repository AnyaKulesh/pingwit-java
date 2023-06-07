package org.example.homework.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = {
                new Box("box1", 10),
                new Box("box2", 14),
                new Box("box3", 18)
        };
        Warehouse warehouse = new Warehouse(boxes);

        for (int i = 0; i < 10; i++) {
            Box box = warehouse.next();
            System.out.println(box);
        }
        System.out.println(warehouse);
        Box[] warehouseBoxes = warehouse.getBoxes();
        System.out.println(Arrays.toString(warehouseBoxes));
    }
}
