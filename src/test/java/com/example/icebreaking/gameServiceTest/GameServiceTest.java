package com.example.icebreaking.gameServiceTest;

import com.example.icebreaking.IcebreakingApplication;
import com.example.icebreaking.domain.game.BalanceGame;
import com.example.icebreaking.service.GameService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;

@SpringBootTest
@ContextConfiguration(classes = GameService.class)
public class GameServiceTest {
    @Autowired
    GameService gameService;

    @Test
    public void 랜덤값가져오기(){
        String[] vs1 = {"오이케이크 먹기", "평생 양치 안하기", "요플레 뚜껑 그냥 버리기", "365일 폭염", "평생동안 키 100cm", "100% 확률로 500만원", "평생 두통", "온 세상 사람들이 나한테만 말하기","절친이 애인 새우 까주기"};
        String[] vs2 = {"김치케이크 먹기", "평생 샤워 안하기","쭈쭈바 꼬다리 그냥 버리기","365일 장마", "평생동안 몸무게 100kg", "20% 확률로 100억" ,"평생 치통", "온 세상 사람들이 나한테 말 안 걸고 내가 말해도 못 듣기", "애인이 절친 새우 까주기"};

//        for(int i = 0; i < vs1.length; i++){
//            BalanceGame balanceGame = new BalanceGame();
//            balanceGame.setId(Long.valueOf(i+1));
//            balanceGame.setSolution1(vs1[i]);
//            balanceGame.setSolution2(vs2[i]);
//            gameService.addQuestion(balanceGame);
//        }

//        long result = gameService.callGameTest();
//
//        Assertions.assertThat(result).isEqualTo(-1);
    }
}
