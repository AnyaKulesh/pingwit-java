package org.example.homework.lesson7;

import java.math.BigDecimal;

/*
Создайте класс HarvestStatistic
String plant - название растения
BigDecimal totalWeight - общий вес урожая со всех полей
 */
public class HarvestStatistics {
    private String plant;
    private BigDecimal totalWeight;
    public HarvestStatistics(String plant, BigDecimal totalWeight) {
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "HarvestStatistics{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
