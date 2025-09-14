package com.ironhack.week04lab.controllers;

import com.ironhack.week04lab.services.TimeService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/time/")
public class TimeController {
    private final TimeService timeService;

    public TimeController() {
        this.timeService = new TimeService();
    };

    @GetMapping("current")
    public Map<String, String> getCurrentTime() {
        return this.timeService.getCurrentTime();
    }

    @GetMapping("date")
    public Map<String, String> getDate() {
        return this.timeService.getDate();
    }

    @GetMapping("day")
    public Map<String, String> getDayOfWeek() {
        return this.timeService.getDayOfWeek();
    }

    @GetMapping("all")
    public ArrayList<Map<String, String>> getAllTime() {
        return this.timeService.getAllTime();
    }
}
