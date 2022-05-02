package com.pokefight.pokefight.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String profileGet(){
        return "pokefight/profile";
    }

    @PostMapping("/profile")
    public String profilePost(){
        return "pokefight/profile";
    }
}
