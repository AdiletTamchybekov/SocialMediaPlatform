package com.example.social_media_platform.repository;

import com.example.social_media_platform.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

