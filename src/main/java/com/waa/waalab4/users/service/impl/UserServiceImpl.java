package com.waa.waalab4.users.service.impl;


import com.waa.waalab4.helper.ListMapper;
import com.waa.waalab4.posts.domain.Post;
import com.waa.waalab4.users.domain.dto.request.UserCreateRequest;
import com.waa.waalab4.users.domain.model.User;
import com.waa.waalab4.users.repository.UserRepository;
import com.waa.waalab4.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private ListMapper listMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,ListMapper listMapper) {
        this.userRepository = userRepository;
        this.listMapper  = listMapper;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void save(UserCreateRequest userCreateRequest) {
        User user  = (User) listMapper.mapObject(userCreateRequest,new User());
        userRepository.save(user);
    }

    @Override
    public List<Post> findUserPost(int id) {
        return userRepository.findPostById(id);
    }

    @Override
    public List<User> findUserWithMinPost(int minPost) {
        return userRepository.findUserWithMinPost(minPost);
    }


}
