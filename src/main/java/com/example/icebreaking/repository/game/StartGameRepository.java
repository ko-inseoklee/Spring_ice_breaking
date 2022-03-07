package com.example.icebreaking.repository.game;

import com.example.icebreaking.domain.game.StartGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StartGameRepository extends JpaRepository<StartGame, Long> {
    Optional<StartGame> findByIdEquals(Long id);

}