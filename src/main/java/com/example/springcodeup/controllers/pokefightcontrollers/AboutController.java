package com.example.springcodeup.controllers.pokefightcontrollers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboutGet(){
        return "pokefight/aboutUs";
    }

    @PostMapping("/about")
    public String aboutPost(){
        return "pokefight/aboutUs";
    }
}
