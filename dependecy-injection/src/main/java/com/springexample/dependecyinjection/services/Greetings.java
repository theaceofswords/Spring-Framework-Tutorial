package com.springexample.dependecyinjection.services;

import org.springframework.stereotype.Service;

@Service                                 //tells that its a spring managed component
public class Greetings {
    public String greet(){
        return "Greetings!!";
    }
}
