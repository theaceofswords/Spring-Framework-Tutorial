package com.springexample.dependecyinjection.controllers;

import com.springexample.dependecyinjection.services.GreetLanguage;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetLanguage greetings;

    public I18NController(@Qualifier("i18nService") GreetLanguage greetings) {
        this.greetings = greetings;
    }

    public String sayHello(){
        return greetings.greetIn();
    }
}
