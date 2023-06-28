package org.example.homework.lesson14.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Task 2
Мировые часы.
Пользователь вводит время с указанием тайм зоны, а программа выдает ему сколько сейчас времени в других городах.
Например, 15.00 Europe/Warsaw:
- Анкара 17.00
- Лондон 14.00
и т.д. Города выберите сами.

 */
public class WorldTime {
    public static final String TIME_PATTERN = "HH:mm";
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern(TIME_PATTERN);

    private static final String[] TIME_ZONES = {"Europe/Minsk", "Europe/Paris", "Asia/Tokyo", "Indian/Antananarivo", "America/Detroit", "Australia/Melbourne"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time");
        String time = scanner.next();
        System.out.println("Enter time zone");
        String timeZone = scanner.next();
        ZoneId zoneId = ZoneId.of(timeZone);

        LocalDateTime ldt = getLocalDateTime(time);

        displayCitiesTime(ldt, zoneId);
    }

    static LocalDateTime getLocalDateTime(String time) {
        LocalTime lt = LocalTime.parse(time, DTF);
        LocalDate ld = LocalDate.now();
        return LocalDateTime.of(ld, lt);
    }

    static void displayCitiesTime(LocalDateTime ldt, ZoneId zoneId) {
        for (String city : TIME_ZONES) {
            LocalDateTime cityLdt = ldt.atZone(zoneId)
                    .withZoneSameInstant(ZoneId.of(city))
                    .toLocalDateTime();
            System.out.println(city + " : " + cityLdt.format(DTF));
        }
    }
}
