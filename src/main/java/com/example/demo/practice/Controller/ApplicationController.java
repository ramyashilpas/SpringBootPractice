package com.example.demo.practice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @RequestMapping("/Application1")
    public String getApplication(){
        return "Hi I am Shilpa.I would like to master SpringBoot";
    }
}
