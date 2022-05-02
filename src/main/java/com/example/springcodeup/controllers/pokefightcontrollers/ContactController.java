package com.pokefight.pokefight.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {
    @GetMapping("/contact")
    public String contactGet(){
        return "pokefight/contactUs";
    }

    @PostMapping("/contact")
    public String contactPost(){
        return "pokefight/contactUs";
    }
}
