package com.example.reddit.Reddit.repository;

import com.example.reddit.Reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
