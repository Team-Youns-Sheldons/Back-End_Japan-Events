package com.gulag.japanevents.services;

import java.util.List;

import com.gulag.japanevents.models.User;
import com.gulag.japanevents.repositories.UserRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

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
