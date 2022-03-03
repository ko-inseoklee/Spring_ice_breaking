package com.example.icebreaking.controller;

import com.example.icebreaking.domain.game.BalanceGame;
import com.example.icebreaking.domain.game.OXQuiz;
import com.example.icebreaking.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
    @Autowired
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("games/balance-game")
    @ResponseBody
    public BalanceGame callRandomBalanceGame(){
        return gameService.loadRandomBalanceGame();
    }

    @GetMapping("games/ox-game")
    @ResponseBody
    public OXQuiz callRandomOXGame(){
        return gameService.loadRandomOXGame();
    }
}
