package com.cognizant.greet.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GreetController {

    @GetMapping("/")
    public Map<String, String> greet() {
        return Map.of("message", "Hello World");
    }
}
