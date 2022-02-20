package com.example.icebreaking.service;

import com.example.icebreaking.domain.game.BalanceGame;
import com.example.icebreaking.repository.game.BalanceGameRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

@Transactional
public class GameService {
    private final BalanceGameRepository balanceGameRepository;


    public GameService(BalanceGameRepository balanceGameRepository) {
        this.balanceGameRepository = balanceGameRepository;
    }

    public void addQuestion(BalanceGame balanceGame){
        this.balanceGameRepository.save(balanceGame);
    }

    public Optional<BalanceGame> callGame(){
        Random random = new Random();
        int cnt = Long.valueOf(balanceGameRepository.count()).intValue();
        Long result = Long.valueOf(random.nextInt(cnt));
        return balanceGameRepository.findByIdEquals(result);
    }

    public Long callGameTest(){
        Random random = new Random();
        int cnt = Long.valueOf(balanceGameRepository.count()).intValue();
        Long result = Long.valueOf(random.nextInt(cnt));
        return result;
    }
}
