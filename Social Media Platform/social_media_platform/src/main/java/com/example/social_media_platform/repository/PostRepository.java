package com.example.social_media_platform.repository;

import com.example.social_media_platform.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
