/*
package com.example.springcodeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class diceRollController {

@GetMapping("/roll-dice")
    public String mainPage(){
    return "diceroll";
}

*/
/*@GetMapping("/roll-dice/{n}")
@ResponseBody
public String guess(@PathVariable int n){
    int roll = (int) Math.floor(Math.random()*6)+1;
    if(n == roll){
    return "Correct!! answer was "+ roll;
    }
    return "Wrongo!! answer was "+ roll;
}*//*

// bonus
    @GetMapping("/roll-dice/{n}")
    @ResponseBody
    public String guess(@PathVariable int n){
        int roll1 = (int) Math.floor(Math.random()*6)+1;
        int roll2 = (int) Math.floor(Math.random()*6)+1;
        int roll3 = (int) Math.floor(Math.random()*6)+1;
        int roll4 = (int) Math.floor(Math.random()*6)+1;
        int roll5 = (int) Math.floor(Math.random()*6)+1;
        int roll6 = (int) Math.floor(Math.random()*6)+1;

        if(n == roll1 ||n == roll2 || n == roll3 || n == roll4 ||n == roll5 || n == roll6){
            return "Correct!!"+howMany(n,roll1, roll2,roll3, roll4,roll5, roll6)+" die landed on your number! our rolls" +showAllRolls(roll1,roll2,roll3,roll4,roll5,roll6);
        }
        return "Wrongo!! i rolled 6 die and none of them landed on "+n+", our rolls were:<br>"+ showAllRolls(roll1,roll2,roll3,roll4,roll5,roll6);
    }
//made an easy 2 methods using a skill I learned on my text adventure!
    public int howMany(int n,int...rolls){
        int i =0;
        for (int roll:rolls) { if(roll == n){
            i++;
        }}
    return i;
    }

    public String showAllRolls(int...rolls){
        StringBuilder i = new StringBuilder();
        for (int roll:rolls) {
            i.append(roll).append(" ");
        }
        return i.toString();
    }
}
*/
