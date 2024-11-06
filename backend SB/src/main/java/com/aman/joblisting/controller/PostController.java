package com.aman.joblisting.controller;

import com.aman.joblisting.repository.PostRepository;
import com.aman.joblisting.model.Post;
import com.aman.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController
{

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;


    @GetMapping("/allPosts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }


}

