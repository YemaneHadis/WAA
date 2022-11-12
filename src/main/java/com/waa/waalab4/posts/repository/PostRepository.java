package com.waa.waalab4.posts.repository;


import com.waa.waalab4.posts.domain.Post;
import com.waa.waalab4.posts.domain.dto.request.PostRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {

    public List<Post> findByTitle(String title);

}
