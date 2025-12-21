package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    User findByEmail(String email);
    User createUser(User user);
    User updateUser(Long id, User updatedUser);
    void deleteUser(Long id);
}
