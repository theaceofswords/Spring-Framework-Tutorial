package com.springexample.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"}) //when a request comes in for a root or for index it will
    private String index(){                         //match to  this
        return "index";
    }
    @RequestMapping({"/oups"})
    public String errorPage(){
        return "Owners/findowners";
    }
}
