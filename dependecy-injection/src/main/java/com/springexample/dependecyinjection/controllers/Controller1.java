package com.springexample.dependecyinjection.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class Controller1 {

    public String print(){
        System.out.println("Watch Out");
        return "Spring is Coming";
    }

}
