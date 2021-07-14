package com.sophia.taskscheduler.sheduler.schedulertype;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class MonthlyScheduling {
    public static LocalDateTime getDate(int monthValue, int date, int hour, int min) {
        return now().plusMonths(monthValue).withDayOfMonth(date).withHour(hour).withMinute(min).withSecond(0);
    }
}
