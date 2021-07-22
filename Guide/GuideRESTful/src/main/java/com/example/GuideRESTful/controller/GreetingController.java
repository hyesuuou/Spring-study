package com.example.GuideRESTful.controller;

import com.example.GuideRESTful.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "Spring") String name){

        return new Greeting(new AtomicLong().incrementAndGet(), String.format(template, name));
    }
}
