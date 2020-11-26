package com.springexample.dependecyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en","default"})
@Service("i18nService")       //qualifier
public class i18nEnglish implements GreetLanguage {
    @Override
    public String greetIn(){
        return "Hello";
    }
}
