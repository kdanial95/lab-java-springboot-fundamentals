package com.ironhack.week04lab.controllers;

import com.ironhack.week04lab.services.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    public TimeController() {};

    @GetMapping("/time")
    public String getCurrentTime() {
        return new TimeService().getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return new TimeService().getDate();
    }

    @GetMapping("/day")
    public String getDayOfWeek() {
        return new TimeService().getDayOfWeek();
    }

    @GetMapping("/all")
    public String getAllTime() {
        return new TimeService().getCurrentTime() + " " + new TimeService().getDayOfWeek() + " " + new TimeService().getDate();
    }
}
