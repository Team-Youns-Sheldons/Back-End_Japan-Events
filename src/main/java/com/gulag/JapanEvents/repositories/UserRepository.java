package com.gulag.japanevents.repositories;

import java.util.Optional;

import com.gulag.japanevents.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public Optional<User> findByUsername(String username);

}
