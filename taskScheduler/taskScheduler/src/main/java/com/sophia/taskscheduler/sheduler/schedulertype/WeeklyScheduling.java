package com.sophia.taskscheduler.sheduler.schedulertype;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

import static java.time.LocalDate.now;

public class WeeklyScheduling {
    public static LocalDateTime getDate(String day, int hour, int min) {
        return mapDayToNumber(day).atTime(hour, min, 0);
    }

    private static LocalDate mapDayToNumber(String day) {
        switch (day.toLowerCase()) {
            case "sunday":
                return now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
            case "monday":
                return now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            case "tuesday":
                return now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
            case "wednesday":
                return now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
            case "thursday":
                return now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
            case "friday":
                return now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
            default:
                return now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        }
    }
}
