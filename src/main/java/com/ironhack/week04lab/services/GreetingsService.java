package com.ironhack.week04lab.services;

public class GreetingsService {
    private final String greeting = "Hello";
    public GreetingsService() {};

    public String getGreeting(String greeting) {
        return greeting != null ? greeting : this.greeting;
    }

    public String getGreetingWithName(String name) {
        return this.greeting + " " + name + " !";
    }

    public int addition (int num1, int num2) {
        return num1 + num2;
    }

    public int multiplication (int num1, int num2) {
        return num1 * num2;
    }
}
