package com.example.Spring_Greeting_app.service;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.GreetingApplication.model.Greeting;
import com.example.GreetingApplication.repository.GreetingRepository;


@Service
public class GreetingService {

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null) {
            return "Hello, " + lastName + "!";
        } else {
            return "Hello World!";
        }
        Greeting greeting = new Greeting(message);
        greetingRepository.save(greeting);
        return message;
    }

    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
    }
}