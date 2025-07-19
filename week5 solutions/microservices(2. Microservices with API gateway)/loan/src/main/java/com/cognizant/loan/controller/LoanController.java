package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/")
    public Map<String, Object> getLoanDetails() {
        return Map.of(
            "number", "H00987987972342",
            "type", "car",
            "loan", 400000,
            "emi", 3258,
            "tenure", 18
        );
    }
}
