package com.gulag.JapanEvents.services;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.gulag.JapanEvents.models.User;
import com.gulag.JapanEvents.repositories.UserRepository;

@Service
public class UserService {

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        List<User> users = repository.findAll();
        return users;
    }

    public User save(@NonNull User newUser) {
        User userSaved = repository.save(newUser);
        return userSaved;
    }

}
