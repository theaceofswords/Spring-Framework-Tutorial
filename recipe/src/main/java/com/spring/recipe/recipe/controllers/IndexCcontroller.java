package com.spring.recipe.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCcontroller {

    @RequestMapping({"","/","/index"})
    public String getIndex(){
        return "index";
    }
}
