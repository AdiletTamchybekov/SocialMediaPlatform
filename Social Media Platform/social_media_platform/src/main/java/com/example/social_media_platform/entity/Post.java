package com.example.social_media_platform.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn (name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
