package com.waa.waalab4.posts.repository.impl;//package com.miu.cs545.posts.repository.impl;
//
//import com.miu.cs545.posts.domain.Post;
//import com.miu.cs545.posts.domain.dto.request.PostRequest;
//import com.miu.cs545.posts.repository.PostRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Repository
//public class PostRepositoryImpl implements PostRepository {
////   private static List<Post> posts = new ArrayList<>();
////        static {
////            Post post1 = new Post(1,"post title 1","post content 1","post author1");
////            Post post2 = new Post(2,"post title 2","post content 2","post author2");
////            Post post3 = new Post(3,"post title 3","post content 3","post author3");
////            posts.add(post1);
////            posts.add(post2);
////            posts.add(post3);
////        }
//    @Override
//    public List<Post> findAll() {
//        return posts;
//    }
//
//    @Override
//    public Post findById(int id) {
//        return posts
//                .stream()
//                .filter(p -> p.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public void updateById(int id, PostRequest post) {
//        Post tobeUpdated = findById(id);
//        tobeUpdated.setAuthor(post.getAuthor());
//        tobeUpdated.setTitle(post.getTitle());
//        tobeUpdated.setContent(post.getContent());
//    }
//
//    @Override
//    public void deleteById(int id) {
//        Post post = findById(id);
//        posts.remove(post);
//    }
//
//    @Override
//    public void save(PostRequest postRequest) {
//
//        int newID = posts.size();
//        Post newPost = new Post();
//        newPost.setId(newID);
//        newPost.setTitle(postRequest.getTitle());
//        newPost.setContent(postRequest.getContent());
//        newPost.setAuthor(postRequest.getAuthor());
//        posts.add(newPost);
//
//    }
//
//
//
//    @Override
//    public List<Post> findByAuthorName(String authorName) {
//            return posts
//                .stream()
//                .filter(post -> (post.getAuthor() == authorName))
//                .collect(Collectors.toList());
//
//    }
//
//    @Override
//    public List<Post> findByTitle(String title) {
//        return null;
//    }
//
//}
