package com.example.icebreaking.controller;

import com.example.icebreaking.domain.game.BalanceGame;
import com.example.icebreaking.domain.game.OXQuiz;
import com.example.icebreaking.domain.game.Quiz;
import com.example.icebreaking.domain.game.StartGame;
import com.example.icebreaking.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
    @Autowired
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    //TODO: 했던 게임 정보를 저장할 필요가 있을 경우에 대한 컨트롤러가 필요함.
    @GetMapping("games/balance-game/random")
    @ResponseBody
    public BalanceGame callRandomBalanceGame(){
        return gameService.loadRandomBalanceGame();
    }

    @GetMapping("games/balance-game/{id:[0-9]*}")
    @ResponseBody
    public BalanceGame callBalanceGameByID(@PathVariable Long id) {
        return gameService.loadBalanceGameFromID(id);
    }

    @GetMapping("games/ox-quiz/random")
    @ResponseBody
    public OXQuiz callRandomOXGame(){
        return gameService.loadRandomOXGame();
    }

    @GetMapping("games/ox-quiz/{id:[0-9]*}")
    @ResponseBody
    public OXQuiz callOXGameByID(@PathVariable Long id) {
        return gameService.loadOXGameFromID(id);
    }

    @GetMapping("games/start-game/random")
    @ResponseBody
    public StartGame callRandomStartGame(){
        return gameService.loadRandomStartGame();
    }

    @GetMapping("games/start-game/{id:[0-9]*}")
    @ResponseBody
    public StartGame callStartGameByID(@PathVariable Long id) {
        return gameService.loadRandomStartGame();
    }

    @GetMapping("games/quiz/random")
    @ResponseBody
    public Quiz callRandomQuizGame(){
        return gameService.loadRandomQuizGame();
    }

    @GetMapping("games/quiz/{id:[0-9]*}")
    @ResponseBody
    public Quiz callQuizGameByID(@PathVariable Long id) {
        return gameService.loadQuizGameFromID(id);
    }
}
