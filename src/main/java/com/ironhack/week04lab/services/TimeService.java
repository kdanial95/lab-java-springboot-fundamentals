package com.ironhack.week04lab.services;

public class TimeService {
    public TimeService() {};

    public String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }

    public String getDate() {
        return java.time.LocalDate.now().toString();
    }

    public String getDayOfWeek() {
        return java.time.LocalDate.now().getDayOfWeek().toString();
    }
}
