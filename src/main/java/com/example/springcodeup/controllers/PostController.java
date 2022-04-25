package com.example.springcodeup.controllers;

import com.example.springcodeup.Post;
import com.example.springcodeup.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class PostController {
    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

/*    public ArrayList<Post> example(){
        ArrayList<Post> ex = new ArrayList<>();
        Post one =new Post("hello!","First post");
        Post two = new Post("hi..", "second post");
        ex.add(one);
        ex.add(two);
        return ex;
    }*/

    @GetMapping("/posts")
    public String posts(Model model){
        ArrayList<Post> allPosts = new ArrayList<>();
                allPosts.add(new Post("looking for a home for dog", "dog, dont want to leave alone, looking for a good home"));
                allPosts.add(new Post("cat", "trying to find a new cat. would love a kitten for our kids to grow up with"));
//        ArrayList<Post> allPosts = (ArrayList<Post>) postDao.findAll();
        model.addAttribute("Posts", allPosts);
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
