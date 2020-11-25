package com.springexample.dependecyinjection.controllers;

import com.springexample.dependecyinjection.services.Greetings;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final Greetings greetings;

    public ConstructorInjectedController(Greetings greetings) {
        this.greetings = greetings;
    }
    public String getString(){
        return greetings.greet();
    }
}
