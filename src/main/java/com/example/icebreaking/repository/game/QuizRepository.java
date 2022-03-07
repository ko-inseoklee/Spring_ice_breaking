package com.example.icebreaking.repository.game;

import com.example.icebreaking.domain.game.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    Optional<Quiz> findByIdEquals(Long id);

}