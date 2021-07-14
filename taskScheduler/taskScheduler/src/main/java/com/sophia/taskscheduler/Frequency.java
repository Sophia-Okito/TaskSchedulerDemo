package com.sophia.taskscheduler;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
public class Frequency {
    private String frequencyType;

    private int frequencyNumber;

    private int hour;

    private int minute;

    private List<String> daysOfWeek;

    private List<Integer> listOfDates;

    private LocalDateTime localDateTime;

    public Frequency(String frequencyType, int frequencyNumber) {
        this.frequencyType = frequencyType;
        this.frequencyNumber = frequencyNumber;
    }

    public Frequency(String frequencyType, int frequencyNumber, int hour, int minute) {
        this.frequencyType = frequencyType;
        this.frequencyNumber = frequencyNumber;
        this.hour = hour;
        this.minute = minute;
    }

    public Frequency(String frequencyType, int hour, int minute, List daysOfWeek) {
        this.frequencyType = frequencyType;
        this.hour = hour;
        this.minute = minute;
        this.daysOfWeek = daysOfWeek;
    }
}


