package com.gulag.JapanEvents.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gulag.JapanEvents.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public Optional<User> findByUsername(String username);

}
