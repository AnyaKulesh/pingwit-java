package org.example.homework.lesson8;

public class Warehouse {
    private Box[] boxes;
    public Warehouse(Box[]boxes){
        this.boxes=boxes;
    }

    public Box[] getBoxes() {
        return boxes.clone();
    }
}
