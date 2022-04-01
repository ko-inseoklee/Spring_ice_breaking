package com.example.icebreaking.repository.communication;

import com.example.icebreaking.domain.Communication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, Long> {
    Optional<Communication> findByIdEquals(Long id);

    List<Communication> findByCategoryEquals(String category);

}