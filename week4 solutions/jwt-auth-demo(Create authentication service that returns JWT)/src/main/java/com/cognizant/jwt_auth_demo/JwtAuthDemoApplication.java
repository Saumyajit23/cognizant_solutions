package com.cognizant.jwt_auth_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cognizant")
public class JwtAuthDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtAuthDemoApplication.class, args);
    }
}
