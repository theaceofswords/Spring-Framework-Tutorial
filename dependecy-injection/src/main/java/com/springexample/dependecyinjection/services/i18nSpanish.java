package com.springexample.dependecyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("sp")
@Service("i18nService")
public class i18nSpanish implements GreetLanguage{
    @Override
    public String greetIn(){
        return "Hola!!";
    }
}
