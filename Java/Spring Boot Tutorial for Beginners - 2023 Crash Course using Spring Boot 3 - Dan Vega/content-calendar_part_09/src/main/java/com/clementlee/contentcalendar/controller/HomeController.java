package com.clementlee.contentcalendar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    // Get values from application.properties into this controller
    // Get "cc.welcomeMessage" value from application.properties, use "Default Welcome Message" if value not provided (default value)
    @Value("${cc.welcomeMessage : Default Welcome Message}")
    private String welcomeMessage;

    @Value("${cc.about}")
    private String about;


    @GetMapping("/")
    public Map<String, String> home(){
        return Map.of("welcomeMessage", welcomeMessage, "about", about);
    }
}
