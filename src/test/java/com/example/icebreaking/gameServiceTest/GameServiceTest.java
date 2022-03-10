//package com.example.icebreaking.gameServiceTest;
//
//import com.example.icebreaking.domain.game.BalanceGame;
//import com.example.icebreaking.domain.game.OXQuiz;
//import com.example.icebreaking.service.GameService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.jdbc.Sql;
//
//@SpringBootTest
//@Sql({"/sql/data.sql"})
////@Transactional
//public class GameServiceTest {
//    @Autowired
//    GameService gameService;
//
//    BalanceGame balanceGame;
//    OXQuiz oxQuiz;
////    @Test
////    public void 밸런스게임추가(){
////        String[] v1 = {"오이케이크 먹기","평생 양치 안하기","요플레 뚜껑 그냥 버리기","365일 폭염","평생동안 키 100cm","100%확률로 500만원", "평생 두통", "온 세상 사람들이 나한테만 말하기", "절친이 애인 새우 까주기", "내가 10억 받고 원수는 100억 받기", "내 인터넷 기록 공개하기","원하는 음식 평생 무료로 제공받기","언제 죽을지 알기","하루 종일 입 다물고 있기","300억 받고 모든 인간관계 정리하기","평생 고기 끊기","자도 자도 피곤히기","마마보이/마마걸이랑 결혼하기","이국종 교수한테 맞고 추성훈한테 수술 받기"};
////        String[] v2 = {"김치케이크 먹기","평생 샤워 안하기","쭈쭈바 꼬다리 그냥 버리기","365일 장마", "평생동안 몸무게 100kg", "1/5확률로 100억", "평생 치통", "온 세상 사람들이 나한테 말 안 걸고 내가 말해도 못 듣기", "애인이 절친 새우 까주기"," 그냥 둘 다 아무것도 안 받기","내 카톡, DM기록 공개하기","원하는 옷 평생 무료로 제공받기","어떻게 죽을지 알기","하루 종일 말하고 다니기","그냥 살기","평생 밀가루 끊기","먹어도 먹어도 배고프기","바람둥이랑 결혼하기","추성훈한테 맞고 이국종 교수한테 수술 받기"};
////
////        for(int i = 0; i < v1.length; i++){
////            balanceGame = new BalanceGame();
////            balanceGame.setSolution1(v1[i]);
////            balanceGame.setSolution2(v2[i]);
////            gameService.addBalanceGame(balanceGame);
////        }
////
////
//////        Assertions.assertThat(result).isEqualTo(-1);
////    }
//
//
//    //TODO: 나온 것 다시 안나오게 하기(유저 정보 들어온 이후에 가능할 듯?).
//    @Test
//    @Sql(scripts = {"/sql/data.sql"})
//    public void 랜덤밸런스게임불러오기(){
////        밸런스게임추가();
//
//        BalanceGame result = gameService.loadRandomBalanceGame();
//        Assertions.assertThat(result.getId()).isEqualTo(1L);
//    }
//
//    @Test
//    public void OX게임생성(){
//        String[] q = { "딸기는 장미과에 속한다","동전 테두리에 있는 톱니는 시각장애인을 위해 고안되었다","뱀은 뒤로 갈 수 있다."," 빵은 순수한 우리말이다.","새는 뒤로도 날 수 있다.","오징어의 피는 푸르다","양파는 채소가 아니라 백합이다","일찍 자야 키가 큰다","지렁이도 눈이 있다","날계란 두개를 동시에 부딪히면 둘다 깨진다","매미의 애벌레는 굼벵이다","지문은 오직 사람에게만 있는 것이다","사람들이 많이 하는 하품은 전염된다","일산화탄소는 암의 원인이자 만병의 근원이다","손톱과 발톱은 피부가 변해서 된 것이다","배꼽의 때를 닦아내면 배가 아프다","물고기는 소변을 보지 않는다","개미도 63빌딩에서 떨어지면 죽는다","개구리는 겨울잠을 자는 동안 숨을 쉬지 않는다","달팽이는 턱이 없다"};
//        boolean[] a = {true, true, false, false, true, true, true, true, false, false, true, false, false, true, true, true, false, false, true, false};
//        for(int i = 0; i < q.length; i++){
//            oxQuiz = new OXQuiz();
//            oxQuiz.setQuestion(q[i]);
//            oxQuiz.setAnswer(a[i]);
//
//            gameService.addOXGame(oxQuiz);
//        }
//    }
//
//    @Test
//    public void 랜덤OX게임불러오기(){
//        OX게임생성();
//
//        OXQuiz result = gameService.loadRandomOXGame();
//
//        Assertions.assertThat(result.getId()).isEqualTo(8L);
//    }
//
//    //TODO: 유저 BL 개발 이후
//    @Test
//    public void 게임저장(){
//
//    }
//}
