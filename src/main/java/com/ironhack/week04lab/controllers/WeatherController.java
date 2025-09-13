package com.ironhack.week04lab.controllers;

import com.ironhack.week04lab.services.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather/")
public class WeatherController {
    public WeatherController() {};

    @GetMapping("temperature")
    public String getCurrentTemperature() {
        return new WeatherService().getCurrentTemperature();
    }

    @GetMapping("condition")
    public String getWeatherCondition() {
        return new WeatherService().getWeatherCondition();
    }

    @GetMapping("wind-speed")
    public String getWindSpeed() {
        return new WeatherService().getWindSpeed();
    }

    @GetMapping("all")
    public String getAllWeatherConditions() {
        return new WeatherService().getCurrentTemperature() + " " + new WeatherService().getWeatherCondition() + " " + new WeatherService().getWindSpeed();
    }
}
