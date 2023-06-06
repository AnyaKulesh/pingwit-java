package org.example.homework.lesson7;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
Создайте класс HarvestStatisticService, добавьте классу метод, который будет получать аргументом массив Harvest[],
а возвращать массив HarvestStatistic[] с посчитанной статистикой.

Внутри метода посчитайте статистику для каждого растения:
- общий вес урожая для каждого растения
 */
public class HarvestStatisticService {
    public static HarvestStatistics[] calculateStatistics(Harvest[] harvest) {
        Map<String, BigDecimal> statistics = new HashMap<>();
        for (Harvest harvestItem : harvest) {
            if (statistics.containsKey(harvestItem.getPlant())) {
                BigDecimal newWeight = statistics.get(harvestItem.getPlant()).add(harvestItem.getWeight());
                statistics.put(harvestItem.getPlant(), newWeight);
            } else {
                statistics.put(harvestItem.getPlant(), harvestItem.getWeight());
            }
        }
        HarvestStatistics[] result = new HarvestStatistics[statistics.size()];
        int i = 0;
        for (Map.Entry<String, BigDecimal> entry : statistics.entrySet()) {
            result[i] = new HarvestStatistics(entry.getKey(), entry.getValue());
            i++;
        }
        return result;
    }
}
