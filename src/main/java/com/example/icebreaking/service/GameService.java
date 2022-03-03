package com.example.icebreaking.service;

import com.example.icebreaking.domain.game.*;
import com.example.icebreaking.repository.game.*;
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
    private final QuizRepository quizRepository;
    private final StartGameRepository startGameRepository;


    public GameService(GameRepository gameRepository, BalanceGameRepository balanceGameRepository, OXQuizRepository oxQuizRepository, QuizRepository quizRepository, StartGameRepository startGameRepository) {
        this.gameRepository = gameRepository;
        this.balanceGameRepository = balanceGameRepository;
        this.oxQuizRepository = oxQuizRepository;
        this.quizRepository = quizRepository;
        this.startGameRepository = startGameRepository;
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

    public Long addQuizGame(Quiz quiz){
        Game game = new Game("Quiz");
        try{
            Long gID = gameRepository.save(game).getId();
            quiz.setId(gID);

            return quizRepository.save(quiz).getId();

        } catch(Exception e){
            e.printStackTrace();
            return -1L;
        }
    }

    public Quiz loadRandomQuizGame(){
        ArrayList<Quiz> games = new ArrayList<Quiz>();
        games.addAll(quizRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

    public Long addStartGame(StartGame startGame){
        Game game = new Game("Quiz");
        try{
            Long gID = gameRepository.save(game).getId();
            startGame.setId(gID);

            return startGameRepository.save(startGame).getId();

        } catch(Exception e){
            e.printStackTrace();
            return -1L;
        }
    }

    public StartGame loadRandomStartGame(){
        ArrayList<StartGame> games = new ArrayList<StartGame>();
        games.addAll(startGameRepository.findAll());

        Random random = new Random();
        int i = random.nextInt(games.size());

        return games.get(i);
    }

}
