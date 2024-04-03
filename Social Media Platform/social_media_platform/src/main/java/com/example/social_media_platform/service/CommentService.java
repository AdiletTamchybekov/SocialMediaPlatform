package com.example.social_media_platform.service;

import com.example.social_media_platform.entity.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getAllPosts();
    Comment getPostById(Long id);
    Comment createPost(Comment post);
    void deletePost(Long id);
    // Other post-related methods
}
