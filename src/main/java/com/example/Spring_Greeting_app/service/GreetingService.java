package com.example.Spring_Greeting_app.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello World";
    }
}