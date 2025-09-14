package com.ironhack.week04lab.controllers;

import com.ironhack.week04lab.services.GreetingsService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {
    GreetingsService greetingsService;

    public GreetingsController() {
        this.greetingsService = new GreetingsService();
    }

    @GetMapping(value = "/hello")
    public String greetings(@RequestParam(required = false) String greeting) {
        return this.greetingsService.getGreeting(greeting);
    }

    @GetMapping("/hello/{name}")
    public String greetingsWithName(@PathVariable String name) {
        return this.greetingsService.getGreetingWithName(name);
    }

    @GetMapping("/add/{num1}/{num2}")
    public int add(
        @PathVariable
        @Min(value = -1_000_000, message = "num1 must be >= -1000000")
        @Max(value = 1_000_000, message = "num1 must be <= 1000000") int num1,
        @PathVariable
        @Min(value = -1_000_000, message = "num2 must be >= -1000000")
        @Max(value = 1_000_000, message = "num2 must be <= 1000000") int num2) {

        return this.greetingsService.addition(num1, num2);
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public int multiply (
            @PathVariable
            @Min(value = -1_000_000, message = "num1 must be >= -1000000")
            @Max(value = 1_000_000, message = "num1 must be <= 1000000") int num1,
            @PathVariable
            @Min(value = -1_000_000, message = "num2 must be >= -1000000")
            @Max(value = 1_000_000, message = "num2 must be <= 1000000") int num2) {
        return this.greetingsService.multiplication(num1, num2);
    }
}
