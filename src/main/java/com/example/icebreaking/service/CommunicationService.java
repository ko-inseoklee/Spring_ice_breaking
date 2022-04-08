package com.example.icebreaking.service;

import com.example.icebreaking.domain.Communication;
import com.example.icebreaking.repository.communication.CommunicationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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

    public Communication loadRandomCommunicationFromCategory(String category){
        ArrayList<Integer> categoryLength = new ArrayList<Integer>(Arrays.asList(4, 2, 2, 2, 3, 3, 3, 3));
        ArrayList<String> categories = new ArrayList<String>(Arrays.asList("나","가치","가족","상상","일상","과거","미래","관계"));

        int random = (int)(new Random().nextInt(9000)) + 1000;
        int idx = categories.indexOf(category);
        int id = idx * 100 + (int)(new Random().nextInt(categoryLength.get(idx)) - 1) + 1;

        return loadCommunicationFromID(new Long(id));
    }

    public List<Communication> loadCommunicationsFromCategory(String category){
        return communicationRepository.findByCategoryEquals(category);
    }
}
