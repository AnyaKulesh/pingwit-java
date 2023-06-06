package org.example.homework.lesson7;

import java.math.BigDecimal;

/*
Task 1
Создайте класс Harvest, в котором будут храниться данные об урожае на ферме.
У Harvest есть поля
Long id - уникальный идентификатор
String field - название поля, с которого был собран урожай (урожаев за год может быть несколько собрано с одного поля)
String plant - название растения (рожь, пшеница, клубника, картошечка и т.д.)
BigDecimal weight - вес собранного урожая
 */
public class Harvest {
    private long id;
    private String field;
    private String plant;
    private BigDecimal weight;
    public Harvest(long id, String field, String plant, BigDecimal weight) {
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }
    public String getPlant() {
        return plant;
    }
    public BigDecimal getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Harvest{" +
                "id=" + id +
                ", field='" + field + '\'' +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
