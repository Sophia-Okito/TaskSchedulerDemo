package com.sophia.taskscheduler.sheduler.schedulertype;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class DailyScheduling {
    public static LocalDateTime getDate(int interval, int hour, int min) {
        return now().plusDays(interval).withHour(hour).withMinute(min).withSecond(0);
    }
}
