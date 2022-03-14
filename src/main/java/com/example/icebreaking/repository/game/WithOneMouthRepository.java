package com.example.icebreaking.repository.game;

import com.example.icebreaking.domain.game.WithOneMouth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WithOneMouthRepository extends JpaRepository<WithOneMouth, Long> {
    Optional<WithOneMouth> findByIdEquals(Long id);
}