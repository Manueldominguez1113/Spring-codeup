package com.pokefight.pokefight.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SplashController {
    @GetMapping("/")
    public String splashGet(){
        return "pokefight/index";
    }

    @PostMapping("/")
    public String splashPost(){
        return "pokefight/index";
    }
}
