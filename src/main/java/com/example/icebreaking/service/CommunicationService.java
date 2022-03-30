package com.example.icebreaking.service;

import com.example.icebreaking.domain.Communication;
import com.example.icebreaking.repository.communication.CommunicationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommunicationService {
    private final CommunicationRepository communicationRepository;

    public CommunicationService(CommunicationRepository communicationRepository) {
        this.communicationRepository = communicationRepository;
    }

    public Communication loadCommunicationFromID(Long id){
        Optional<Communication> result = communicationRepository.findByIdEquals(id);

        if(result.isPresent()) return result.get();

        return null;
    }

    public List<Communication> loadCommunicationsFromCategory(String category){
        return communicationRepository.findByCategoryEquals(category);
    }
}
