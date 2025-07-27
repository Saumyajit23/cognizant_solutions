package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/")
    public Map<String, Object> getAccountDetails() {
        return Map.of(
            "number", "00987987973432",
            "type", "savings",
            "balance", 234343
        );
    }
}
