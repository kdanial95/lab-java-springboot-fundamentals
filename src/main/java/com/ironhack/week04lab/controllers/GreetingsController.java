package com.ironhack.week04lab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    public GreetingsController() {};

    @GetMapping("/hello")
    public String greetings() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String greetingsWithName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public int add(@PathVariable int num1,@PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public int multiply (@PathVariable int num1,@PathVariable int num2) {
        return num1 * num2;
    }
}
