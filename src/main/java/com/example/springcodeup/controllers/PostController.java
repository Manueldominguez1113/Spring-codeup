package com.example.springcodeup.controllers;

import com.example.springcodeup.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    public ArrayList<Post> example(){
        ArrayList<Post> ex = new ArrayList<>();
        Post one =new Post("hello!","First post");
        Post two = new Post("hi..", "second post");
        ex.add(one);
        ex.add(two);
        return ex;
    }

    @GetMapping("/posts")
    public String posts(Model model){
        model.addAttribute("Posts", example());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postIds(@PathVariable Post id, Model model){
        model.addAttribute("id",id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String startCreatePost(){
        return "view the form to create a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }


}
