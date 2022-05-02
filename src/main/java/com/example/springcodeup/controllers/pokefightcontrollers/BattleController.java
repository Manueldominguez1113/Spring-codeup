package com.example.springcodeup.controllers.pokefightcontrollers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class BattleController {
    @GetMapping("/battle")
    public String battleGet(){
        return "pokefight/battle";
    }

    @PostMapping("/battle")
    public String battlePost(){
        return "pokefight/battle";
    }
}
