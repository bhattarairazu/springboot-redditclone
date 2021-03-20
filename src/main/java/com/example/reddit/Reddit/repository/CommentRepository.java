package com.example.reddit.Reddit.repository;

import com.example.reddit.Reddit.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository  extends JpaRepository<Comment,Long> {
}
