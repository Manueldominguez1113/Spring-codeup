package com.pokefight.pokefight.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {
    @GetMapping("/signup")
    public String registerGet(){
        return "pokefight/registration";
    }

    @PostMapping("/signup")
    public String registerPost(){
        return "pokefight/registration";
    }
}
