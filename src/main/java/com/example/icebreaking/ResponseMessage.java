package com.example.icebreaking;

public class ResponseMessage {
    // 시스템 관련 응답 메세지
    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";
    public static final String DB_ERROR = "데이터베이스 에러";

    // USER 관련 응답 메세지
    public static final String USER_FOUND = "유저 찾기 성공";
    public static final String USER_CREATE_SUCCESS = "유저 정보 생성 성공";
    public static final String USER_CREATE_FAIL = "유저 정보 생성 실패";
    public static final String SIGN_IN_SUCCESS = "로그인 성공";
    public static final String SIGN_IN_FAIL = "로그인 실패";


    // 게임 관련 응답 메세지
    public static final String GAME_LOAD_SUCCESS = "게임 불러오기 성공";
    public static final String GAME_LOAD_FAIL = "게임 불러오기 실패";

    // 대화 관련 응답 메세지
    public static final String COMMUNICATION_LOAD_SUCCESS = "대화 불러오기 성공";
    public static final String COMMUNICATION_LOAD_FAIL = "대화 불러오기 실패";

    // 전화번호 인증 응답 메세지
    public static final String MORE_THAN_TEN_TIMES_REQUEST = "일일 전송 횟수를 초과했습니다.";
    public static final String CONFIRM_CREATE_SUCCESS = "전화번호 인증 요청 성공";
    public static final String CONFIRM_CHECK_SUCCESS = "전화번호 인증 성공";
    public static final String CONFIRM_CHECK_FAIL = "전화번호 인증 실패";
}
