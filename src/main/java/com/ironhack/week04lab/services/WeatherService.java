package com.ironhack.week04lab.services;

import java.util.Random;

public class WeatherService {
    public WeatherService() {};

    public String getCurrentTemperature() {
        int temperature = new Random().nextInt(-10, 41);
        return temperature + "°C";
    }

    public String getWeatherCondition() {
        String[] conditions = {"Sunny", "Cloudy", "Rainy", "Snowy"};
        return conditions[new Random().nextInt(conditions.length)];
    }

    public String getWindSpeed() {
        int windSpeed = new Random().nextInt(10, 101);
        return windSpeed + "km/h";
    }
}
