package com.example.news2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class ControllerTwo {
    @GetMapping
    public String exampleOne() {
        return "first end point";
    }

    @GetMapping("/login")
    public String login() {
        return "You have been authenticated";
    }
}
