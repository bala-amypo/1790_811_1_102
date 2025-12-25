package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;

public interface UserService {

    void registerUser(RegisterRequest request);

    String authenticateUser(AuthRequest request);

    // Optional: other user-related methods
    User getUserById(Long id);
}
