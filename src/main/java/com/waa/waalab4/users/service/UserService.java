package com.waa.waalab4.users.service;



import com.waa.waalab4.posts.domain.Post;
import com.waa.waalab4.users.domain.dto.request.UserCreateRequest;
import com.waa.waalab4.users.domain.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    void save(UserCreateRequest userCreateRequest);

    List<Post> findUserPost(int id);

    List<User> findUserWithMinPost(int minPost);
}
