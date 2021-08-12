package com.dipak.spring.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.spring.reddit.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}