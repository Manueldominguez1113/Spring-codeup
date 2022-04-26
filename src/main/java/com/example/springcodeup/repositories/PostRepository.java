package com.example.springcodeup.repositories;

import com.example.springcodeup.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
