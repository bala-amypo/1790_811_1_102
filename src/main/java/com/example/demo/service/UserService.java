package com.example.warranty.service;

import java.util.Optional;
import com.example.warranty.entity.User;

public interface UserService {

    User register(User user);

    Optional<User> findByEmail(String email);
}
