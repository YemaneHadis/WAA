package com.waa.waalab4.posts.service;


import com.waa.waalab4.posts.domain.Post;
import com.waa.waalab4.posts.domain.dto.request.PostRequest;

import java.util.List;

public interface PostService {

    public List<Post> findAll();

    public Post findById(int id);

//    public void updateById(int id, PostRequest post);

    public void deleteById(int id);

    void save(PostRequest postRequest);

    List<PostRequest> findAllV2();

//    List<PostRequest> findByAuthorName(String authorName);

    List<Post> findByTitle(String title);
}
