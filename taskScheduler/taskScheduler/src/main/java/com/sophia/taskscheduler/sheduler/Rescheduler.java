package com.sophia.taskscheduler.sheduler;

import com.sophia.taskscheduler.Frequency;

import java.time.LocalDateTime;

public class Rescheduler {
    public static LocalDateTime rescheduleTask(Frequency frequency) {
        switch (frequency.getFrequencyType().toLowerCase()) {
            case "hourly":
                return Scheduler.hourlyScheduler(frequency);
            case "daily":
                return Scheduler.dailyScheduler(frequency);
            case "weekly":
                return Scheduler.weeklyScheduler(frequency);
            case "monthly":
                return Scheduler.monthlyScheduler(frequency);
            default:
                return LocalDateTime.now();
        }
    }
}
