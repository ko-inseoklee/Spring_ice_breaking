package com.example.icebreaking.repository.game;

import com.example.icebreaking.domain.game.OXQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OXQuizRepository extends JpaRepository<OXQuiz, Long> {
}