package org.example.homework.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Harvest[] otherHarvest = new Harvest[4];
        otherHarvest[0] = new Harvest(1, "1", "Wheat", 10d);
        otherHarvest[1] = new Harvest(2, "2", "Wheat", 12d);
        otherHarvest[2] = new Harvest(3, "3", "Strawberry", 16d);
        otherHarvest[3] = new Harvest(4, "4", "Rye", 54d);

        HarvestStatistics[] statisticsArray = HarvestStatisticService.calculateStatistics(otherHarvest);

        System.out.println(Arrays.toString(otherHarvest));

        for(HarvestStatistics element : statisticsArray){
            System.out.println(element.getPlant() + " = " + element.getTotalWeight());
        }
        }
    }

