package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private String salutation;

    public GreetingService() {
        this.salutation = "Hello";
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String greet(String name) {
        return this.salutation + ", " + name;
    }
}
