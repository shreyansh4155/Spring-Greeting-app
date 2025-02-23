package com.example.Spring_Greeting_app.controller;

import com.example.GreetingApplication.model.Greeting;
import com.example.GreetingApplication.service.GreetingService;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;rvice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }



    @PostMapping
    public String postGreeting(@RequestBody String name) {
        return "{\"message\": \"Hello, " + name + "! Your greeting is created.\"}";
    }

    @PutMapping
    public String putGreeting(@RequestBody String name) {
        return "{\"message\": \"Hello, " + name + "! Your greeting is updated.\"}";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted successfully.\"}";
    }
    @GetMapping
    public String getGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName) {
        return "{\"message\": \"" + greetingService.getGreetingMessage(firstName, lastName) + "\"}";
    }
}