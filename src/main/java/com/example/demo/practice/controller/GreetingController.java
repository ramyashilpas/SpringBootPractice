package com.example.demo.practice.controller;

import com.example.demo.practice.model.Greeting;
import com.example.demo.practice.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    //@GetMapping("/greeting")
    @RequestMapping(method = RequestMethod.GET, path = "/greeting")
    Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return greetingService.returnGreetingMessage(name);
    }
}
