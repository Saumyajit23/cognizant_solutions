package com.cognizant.greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GreetServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GreetServiceApplication.class, args);
    }
}