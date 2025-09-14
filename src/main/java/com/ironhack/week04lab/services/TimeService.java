package com.ironhack.week04lab.services;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;

public class TimeService {
    public TimeService() {};

    public Map<String, String> getCurrentTime() {
        return Map.of("Time: ", java.time.LocalTime.now().toString());
    }

    public Map<String, String> getDate() {
        return Map.of("Date: ", java.time.LocalDate.now().toString());
    }

    public Map<String, String> getDayOfWeek() {
        return Map.of("Day: ", java.time.LocalDate.now().getDayOfWeek().toString());
    }

    public ArrayList<Map<String, String>> getAllTime() {
        ArrayList<Map<String, String>> times = new ArrayList<>();
        times.add(getCurrentTime());
        times.add(getDate());
        times.add(getDayOfWeek());

        return times;
    }
}
