package com.example.icebreaking.repository.game;

import com.example.icebreaking.domain.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}