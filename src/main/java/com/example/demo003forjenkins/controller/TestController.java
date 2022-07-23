package com.example.demo003forjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getName")
    public String getName(){
        return "lee hao22";
    }
}
