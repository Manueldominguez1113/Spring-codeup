/*
package com.example.springcodeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String Add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " plus " + num2 + " equals " + (num1 + num2);
    }

// subtract
@GetMapping("/subtract/{num1}/from/{num2}")
@ResponseBody
public String subtract(@PathVariable int num1, @PathVariable int num2) {
    return num2 + " minus " + num1 + " equals " + (num2 - num1);
}

// multiply and
@GetMapping("/multiply/{num1}/and/{num2}")
@ResponseBody
public String multiply(@PathVariable int num1, @PathVariable int num2) {
    return num1 + " times " + num2 + " makes " + (num1 * num2);
}
// divide by
@GetMapping("/divide/{num1}/from/{num2}")
@ResponseBody
public String divide(@PathVariable int num1, @PathVariable int num2) {
    return num1 + " divided by " + num2 + " makes " + (num1 * num2);
}

}*/
