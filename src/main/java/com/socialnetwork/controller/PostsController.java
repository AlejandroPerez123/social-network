package com.socialnetwork.controller;

import com.socialnetwork.dto.PostRequest;
import com.socialnetwork.dto.PostResponse;
import com.socialnetwork.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostsController {





    @PostMapping
    public ResponseEntity<PostResponse> createPost(@RequestBody PostRequest request){
        Post newPost = new Post();
        newPost.setPostedBy(request.getPostedBy());
        newPost.setComment(request.getComment());
        PostResponse postResponse = new PostResponse(newPost.getPostedBy(), newPost.getComment());
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }



}
