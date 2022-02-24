package com.example.icebreaking.service;

import com.example.icebreaking.domain.game.BalanceGame;
import com.example.icebreaking.domain.game.Game;
import com.example.icebreaking.domain.game.OXQuiz;
import com.example.icebreaking.repository.game.BalanceGameRepository;
import com.example.icebreaking.repository.game.GameRepository;
import com.example.icebreaking.repository.game.OXQuizRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Random;


@Service
@Transactional
public class GameService {
    private final GameRepository gameRepository;
    private final BalanceGameRepository balanceGameRepository;
    private final OXQuizRepository oxQuizRepository;


    public GameService(GameRepository gameRepository, BalanceGameRepository balanceGameRepository, OXQuizRepository oxQuizRepository) {
        this.gameRepository = gameRepository;
        this.balanceGameRepository = balanceGameRepository;
        this.oxQuizRepository = oxQuizRepository;
    }

    public Long addBalanceGame(BalanceGame balanceGame){
        Game game = new Game("balance");
        try{
            Long gID = gameRepository.save(game).getId();
            balanceGame.setId(gID);

            return balanceGameRepository.save(balanceGame).getId();

        } catch(Exception e){
            e.printStackTrace();
            return -1L;
        }
    }

    public BalanceGame loadRandomBalanceGame(){
        ArrayList<BalanceGame> games = new ArrayList<BalanceGame>();
        games.addAll(balanceGameRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public Long addOXGame(OXQuiz oxQuiz){
        Game game = new Game("OXQuiz");
        try{
            Long gID = gameRepository.save(game).getId();
            oxQuiz.setId(gID);

            return oxQuizRepository.save(oxQuiz).getId();

        } catch(Exception e){
            e.printStackTrace();
            return -1L;
        }
    }

    public OXQuiz loadRandomOXGame(){
        ArrayList<OXQuiz> games = new ArrayList<OXQuiz>();
        games.addAll(oxQuizRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

}
