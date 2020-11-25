package com.springexample.dependecyinjection.controllers;

import com.springexample.dependecyinjection.services.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public Greetings greetings;
    public String getGreetings(){
        return greetings.greet();
    }
}
