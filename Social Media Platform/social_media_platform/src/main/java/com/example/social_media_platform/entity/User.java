package com.example.social_media_platform.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
