package com.okuru.springmypostman.controller;

import com.okuru.springmypostman.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PostsController {

    private List<Post> posts  = new ArrayList<>();
    {
        posts.add(new Post(1 , "дфыорлол " , "шожщш оз" , "first desc" , "dfsdfsdfsdfsdfsdfsfsd BODY"));
        posts.add(new Post(2 , "олдгргшщршгш г post" , "щожшщо" , "ssecond desc" , "dfsdfsdfsdfsdfsdfsfsd BODY"));
        posts.add(new Post(3 , "third post" , "длощдштщш" , "third desc" , "dfsdfsdfsdfsdfsdfsfsd BODY"));
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/posts")
    public List<Post> getPosts(){
        return posts;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        posts.add(post);
        return ResponseEntity.accepted().body(post);
    }

}
