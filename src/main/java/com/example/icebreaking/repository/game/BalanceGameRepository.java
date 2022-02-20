package com.example.icebreaking.repository.game;

import com.example.icebreaking.domain.game.BalanceGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BalanceGameRepository extends JpaRepository<BalanceGame, Long> {
    Optional<BalanceGame> findByIdEquals(Long id);

    @Query(value = "select count(*) from BalanceGame bg")
    public long count();
}