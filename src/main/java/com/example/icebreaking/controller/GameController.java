package com.example.icebreaking.controller;

import com.example.icebreaking.ResponseMessage;
import com.example.icebreaking.StatusCode;
import com.example.icebreaking.domain.game.*;
import com.example.icebreaking.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("games")
public class GameController {
    @Autowired
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    //TODO: 했던 게임 정보를 저장할 필요가 있을 경우에 대한 컨트롤러가 필요함.
    @GetMapping("balance-game/random")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<BalanceGame> callRandomBalanceGame(){
        BalanceGame balanceGame = gameService.loadRandomBalanceGame();
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,balanceGame);
    }

    @GetMapping("balance-game/{id:[0-9]*}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<BalanceGame> callBalanceGameByID(@PathVariable Long id) {
        BalanceGame balanceGame = gameService.loadBalanceGameFromID(id);
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,balanceGame);
    }

    @GetMapping("ox-quiz/random")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<OXQuiz> callRandomOXGame(){
        OXQuiz quiz = gameService.loadRandomOXGame();
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,quiz);
    }

    @GetMapping("ox-quiz/{id:[0-9]*}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<OXQuiz> callOXGameByID(@PathVariable Long id) {
        OXQuiz quiz = gameService.loadOXGameFromID(id);
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,quiz);
    }

    @GetMapping("start-game/random")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<StartGame> callRandomStartGame(){
        StartGame startGame = gameService.loadRandomStartGame();
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,startGame);
    }

    @GetMapping("start-game/{id:[0-9]*}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<StartGame> callStartGameByID(@PathVariable Long id) {
        StartGame startGame = gameService.loadStartGameFromID(id);
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,startGame);
    }

    @GetMapping("quiz/random")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<Quiz> callRandomQuizGame(){
        Quiz quiz = gameService.loadRandomQuizGame();
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,quiz);
    }

    @GetMapping("quiz/{id:[0-9]*}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<Quiz> callQuizGameByID(@PathVariable Long id) {
        Quiz quiz = gameService.loadQuizGameFromID(id);
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,quiz);
    }

    @GetMapping("with-one-mouth/random")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<WithOneMouth> callRandomWOMGame(){
        WithOneMouth withOneMouth = gameService.loadRandomWOMGame();
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,withOneMouth);
    }

    @GetMapping("with-one-mouth/{id:[0-9]*}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomizedResponseEntity<WithOneMouth> callWOMGameByID(@PathVariable Long id) {
        WithOneMouth withOneMouth = gameService.loadWOMGameFromID(id);
        return new CustomizedResponseEntity(StatusCode.OK, ResponseMessage.GAME_LOAD_SUCCESS,withOneMouth);
    }
}
