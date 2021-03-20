package com.example.reddit.Reddit.repository;

import com.example.reddit.Reddit.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken,Long> {
}
