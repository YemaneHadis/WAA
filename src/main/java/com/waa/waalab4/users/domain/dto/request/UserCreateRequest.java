package com.waa.waalab4.users.domain.dto.request;

import com.waa.waalab4.posts.domain.Post;
import lombok.Data;

import java.util.List;

@Data
public class UserCreateRequest {
    String name;
    List<Post> posts;
}
