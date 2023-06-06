package org.example.homework.lesson7;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Harvest[] otherHarvest = new Harvest[4];
        otherHarvest[0] = new Harvest(1, "1", "Wheat", new BigDecimal(10));
        otherHarvest[1] = new Harvest(2, "2", "Wheat", new BigDecimal(12));
        otherHarvest[2] = new Harvest(3, "3", "Strawberry", new BigDecimal(16));
        otherHarvest[3] = new Harvest(4, "4", "Rye", new BigDecimal(56));

        HarvestStatistics[] statisticsArray = HarvestStatisticService.calculateStatistics(otherHarvest);

        System.out.println(Arrays.toString(otherHarvest));

        for (HarvestStatistics element : statisticsArray) {
            System.out.println(element.getPlant() + " = " + element.getTotalWeight());
        }
    }
}

