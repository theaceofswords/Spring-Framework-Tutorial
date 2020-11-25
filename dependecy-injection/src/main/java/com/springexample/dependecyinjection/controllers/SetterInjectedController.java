package com.springexample.dependecyinjection.controllers;

import com.springexample.dependecyinjection.services.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Autowired                          //tells spring that we want greetings injected
   public Greetings greetings;
    public void setString(Greetings greetings){
        this.greetings = greetings;
    }
    public String getString(){
        return greetings.greet();
    }

}
