package com.sophia.taskscheduler.sheduler;

import com.sophia.taskscheduler.Frequency;
import com.sophia.taskscheduler.sheduler.schedulertype.DailyScheduling;
import com.sophia.taskscheduler.sheduler.schedulertype.HourlyScheduling;
import com.sophia.taskscheduler.sheduler.schedulertype.MonthlyScheduling;
import com.sophia.taskscheduler.sheduler.schedulertype.WeeklyScheduling;

import java.time.LocalDateTime;
import java.util.List;

public interface Scheduler {
    static LocalDateTime hourlyScheduler(Frequency frequency) {
        return HourlyScheduling.getDate(frequency.getFrequencyNumber());
    }

    static java.time.LocalDateTime dailyScheduler(Frequency frequency) {
        return DailyScheduling.getDate(frequency.getFrequencyNumber(),
                frequency.getHour(), frequency.getMinute());
    }

    static java.time.LocalDateTime weeklyScheduler(Frequency frequency) {
        List<String> daysOfWeek= frequency.getDaysOfWeek();
        int index = daysOfWeek.indexOf(LocalDateTime.now().getDayOfWeek().toString());
        if (daysOfWeek.size() - 1 == index) {
            return WeeklyScheduling.getDate(daysOfWeek.get(0),
                   frequency.getHour(), frequency.getMinute());
        } else {
            return WeeklyScheduling.getDate(daysOfWeek.get(index++),
                    frequency.getHour(), frequency.getMinute());
        }
    }

    static java.time.LocalDateTime monthlyScheduler(Frequency frequency) {
        List<Integer> dateList = frequency.getListOfDates();
        int index = dateList.indexOf(LocalDateTime.now().getDayOfMonth());
        if (dateList.size() - 1 == index) {
            return MonthlyScheduling.getDate(0, dateList.get(0),
                    frequency.getHour(), frequency.getMinute());
        } else {
            return MonthlyScheduling.getDate(1, dateList.get(index++),
                    frequency.getHour(), frequency.getMinute());
        }
    }
    
       static List<DayOfWeek> convertToDayOfWeek(List<String> daysOfWeek) {
        List<DayOfWeek> dayOfWeeks = new ArrayList<>();
        for (String s : daysOfWeek) { dayOfWeeks.add(DayOfWeek.valueOf(s.toUpperCase())); }
        return dayOfWeeks;
    }

}

