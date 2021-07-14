package com.sophia.taskscheduler.sheduler.schedulertype;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class HourlyScheduling {
    public static LocalDateTime getDate(int hour) {
        return now().plusHours(hour).withMinute(0).withSecond(0);
    }
}
