package com.example.icebreaking.service;

import com.example.icebreaking.domain.game.*;
import com.example.icebreaking.repository.game.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;


@Service
@Transactional
public class GameService /*implements CommandLineRunner*/ {
    private final GameRepository gameRepository;
    private final BalanceGameRepository balanceGameRepository;
    private final OXQuizRepository oxQuizRepository;
    private final QuizRepository quizRepository;
    private final StartGameRepository startGameRepository;
    private final WithOneMouthRepository withOneMouthRepository;


    public GameService(GameRepository gameRepository, BalanceGameRepository balanceGameRepository, OXQuizRepository oxQuizRepository, QuizRepository quizRepository, StartGameRepository startGameRepository, WithOneMouthRepository withOneMouthRepository) {
        this.gameRepository = gameRepository;
        this.balanceGameRepository = balanceGameRepository;
        this.oxQuizRepository = oxQuizRepository;
        this.quizRepository = quizRepository;
        this.startGameRepository = startGameRepository;
        this.withOneMouthRepository = withOneMouthRepository;
    }

    public BalanceGame loadRandomBalanceGame(){
        ArrayList<BalanceGame> games = new ArrayList<BalanceGame>();
        games.addAll(balanceGameRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public BalanceGame loadBalanceGameFromID(Long id){
        Optional<BalanceGame> balanceGame =  balanceGameRepository.findByIdEquals(id);

        if(balanceGame.isPresent()) return balanceGame.get();
        else return null;
    }

    public OXQuiz loadRandomOXGame(){
        ArrayList<OXQuiz> games = new ArrayList<OXQuiz>();
        games.addAll(oxQuizRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public OXQuiz loadOXGameFromID(Long id){
        Optional<OXQuiz> oxQuiz =  oxQuizRepository.findByIdEquals(id);

        if(oxQuiz.isPresent()) return oxQuiz.get();
        else return null;
    }

    public Quiz loadRandomQuizGame(){
        ArrayList<Quiz> games = new ArrayList<>();
        games.addAll(quizRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public Quiz loadQuizGameFromID(Long id){
        Optional<Quiz> quiz =  quizRepository.findByIdEquals(id);

        if(quiz.isPresent()) return quiz.get();
        else return null;
    }

    public StartGame loadRandomStartGame(){
        ArrayList<StartGame> games = new ArrayList<>();
        games.addAll(startGameRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public StartGame loadStartGameFromID(Long id){
        Optional<StartGame> startGame =  startGameRepository.findByIdEquals(id);

        if(startGame.isPresent()) return startGame.get();
        else return null;
    }

    public WithOneMouth loadRandomWOMGame(){
        ArrayList<WithOneMouth> games = new ArrayList<>();
        games.addAll(withOneMouthRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public WithOneMouth loadWOMGameFromID(Long id){
        Optional<WithOneMouth> withOneMouth =  withOneMouthRepository.findByIdEquals(id);

        if(withOneMouth.isPresent()) return withOneMouth.get();
        else return null;
    }

}
