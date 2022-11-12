package com.waa.waalab4.users.domain.model;

import com.waa.waalab4.posts.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    long id;
    String name;
    String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    List<Post> posts;
}
