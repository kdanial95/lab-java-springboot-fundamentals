package com.ironhack.week04lab.services;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class WeatherService {
    public WeatherService() {};

    public Map<String, String> getCurrentTemperature() {
        int temperature = new Random().nextInt(-10, 41);
        return Map.of("Temperature", temperature + "°C");
    }

    public Map<String, String> getWeatherCondition() {
        String[] conditions = {"Sunny", "Cloudy", "Rainy", "Snowy"};
        return Map.of("Weather condition: ", conditions[new Random().nextInt(conditions.length)]);
    }

    public Map<String, String> getWindSpeed() {
        int windSpeed = new Random().nextInt(10, 101);
        return Map.of("Wind speed: ", windSpeed + "km/h");
    }

    public ArrayList<Map<String, String>> getAllWeatherConditions() {
        ArrayList<Map<String, String>> list = new ArrayList<>();
        list.add(getCurrentTemperature());
        list.add(getWeatherCondition());
        list.add(getWindSpeed());
        
        return list;
    }
}
