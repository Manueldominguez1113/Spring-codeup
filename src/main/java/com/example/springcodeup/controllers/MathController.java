package com.example.springcodeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/Add/{num1}/and/{num2}")
    @ResponseBody
    public String Add(@PathVariable int num1, @PathVariable int num2){
return num1 +" plus "+ num2+ " equals" + (num1+num2);
    }
}
