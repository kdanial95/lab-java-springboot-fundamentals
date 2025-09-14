package com.ironhack.week04lab.controllers;

import com.ironhack.week04lab.services.WeatherService;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather/")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController() {
        this.weatherService = new WeatherService();
    }

    @GetMapping("temperature")
    public Map<String, String> getCurrentTemperature() {
        return this.weatherService.getCurrentTemperature();
    }

    @GetMapping("condition")
    public Map<String, String> getWeatherCondition() {
        return this.weatherService.getWeatherCondition();
    }

    @GetMapping("wind-speed")
    public Map<String, String> getWindSpeed() {
        return this.weatherService.getWindSpeed();
    }

    @GetMapping("all")
    public ArrayList<Map<String, String>> getAllWeatherConditions() {
        return this.weatherService.getAllWeatherConditions();
    }
}
