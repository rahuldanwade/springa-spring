package com.reeneev.security.repository;

import java.util.List;

import com.reeneev.security.model.User;

public interface UserRepository {
    List<User> getAll();

    void save(User user);

    void deleteAll();
}
