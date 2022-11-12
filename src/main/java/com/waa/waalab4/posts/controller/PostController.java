package com.waa.waalab4.posts.controller;

import com.waa.waalab4.posts.domain.Post;
import com.waa.waalab4.posts.domain.dto.request.PostRequest;

import com.waa.waalab4.posts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v1/posts")
    public List<Post> getAll(){
            return postService.findAll();
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v1/posts/{id}")
    public Post findById(@PathVariable int id){
        return postService.findById(id);
    }

//    @ResponseStatus(HttpStatus.OK)
//    @PutMapping("/v1/posts/{id}")
//    public void update(@PathVariable int id, @RequestBody PostRequest postRequest){
//        postService.updateById(id,postRequest);
//
//    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/v1/posts/{id}")
    public void delete(@PathVariable int id){
        postService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void addPost(@RequestBody PostRequest postRequest){
        postService.save(postRequest);
    }


    /**
     * TODO version2
     * */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v2/posts")
    public List<PostRequest> getAllV2(){

        return postService.findAllV2();
    }

//
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping("/v2/posts/{authorName}")
//    public List<PostRequest> postByAuthor(@PathVariable String authorName ){
//        return postService.findByAuthorName(authorName);
//    }


    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/v1/posts/{title}")
    public List<Post> postWithTitle(@PathVariable String title){
        return postService.findByTitle(title);
    }


}

