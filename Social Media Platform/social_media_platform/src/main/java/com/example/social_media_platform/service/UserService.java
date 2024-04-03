package com.example.social_media_platform.service;

import com.example.social_media_platform.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
    // Other user-related methods
}