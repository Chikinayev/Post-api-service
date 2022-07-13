package com.example.postcoreapi.controller;


import com.example.postcoreapi.model.PostModel;
import com.example.postcoreapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;


    @PostMapping
    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel){
        postService.createPost(postModel);
        return new ResponseEntity<>("Post successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId){
        return postService.getPostById(postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePostById(@PathVariable String postId,
                                                 @Valid @RequestBody PostModel postModel){
        postService.updatePostById(postId,postModel);
        return new ResponseEntity<>("Post updated succesfully",HttpStatus.OK);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePostById(@PathVariable String postId){
        postService.deletePostById(postId);
        return new ResponseEntity<>("Post deleted successfully", HttpStatus.OK);
    }

}
