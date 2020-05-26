
package com.example.news2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOne {
    @GetMapping("/")
    public String hello() {
        return "hello!";
    }
}