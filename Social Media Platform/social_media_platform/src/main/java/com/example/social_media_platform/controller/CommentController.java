// CommentController.java
package com.example.social_media_platform.controller;

import com.example.social_media_platform.dto.CommentDTO;
import com.example.social_media_platform.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<CommentDTO>> getAllComments() {
        List<CommentDTO> comments = commentService.getAllComments();
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> getCommentById(@PathVariable Long id) {
        CommentDTO comment = commentService.getCommentById(id);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CommentDTO> createComment(@RequestBody CommentDTO commentDTO) {
        CommentDTO savedComment = commentService.createComment(commentDTO);
        return new ResponseEntity<>(savedComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Other comment-related endpoints
}

