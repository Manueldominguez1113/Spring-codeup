package com.example.springcodeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class newController {

    @GetMapping("/")
    public String index(){
        return "pokefight/index";
    }
}
