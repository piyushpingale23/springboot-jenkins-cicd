package com.devops.springbootjenkinscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to SpringBoot Jenkins CI/CD....!";
    }
}
