package com.example.social_media_platform.service;

import com.example.social_media_platform.entity.Post;
import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post createPost(Post post);
    void deletePost(Long id);
    // Other post-related methods
}

