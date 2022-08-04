package com.reeneev.security.service;

import org.springframework.stereotype.Service;

import com.reeneev.security.model.User;
import com.reeneev.security.repository.UserRepository;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void save(User user) {
        Objects.requireNonNull(user);
        repository.save(user);
    }
}