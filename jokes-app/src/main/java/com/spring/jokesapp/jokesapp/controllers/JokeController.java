package com.spring.jokesapp.jokesapp.controllers;

import com.spring.jokesapp.jokesapp.services.Jokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private Jokes jokes;

    @Autowired
    public JokeController(Jokes jokes){
        this.jokes = jokes;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokes.getJoke());
        return "chucknorris";
    }

}
