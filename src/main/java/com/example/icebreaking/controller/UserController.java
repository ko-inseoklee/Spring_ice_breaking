package com.example.icebreaking.controller;

import com.example.icebreaking.ResponseMessage;
import com.example.icebreaking.StatusCode;
import com.example.icebreaking.domain.User;
import com.example.icebreaking.domain.game.OXQuiz;
import com.example.icebreaking.service.UserService;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //인증번호 전송
    @PostMapping("send-auth")
    public String sendAuthCode(@RequestBody String phoneNumber) throws CoolsmsException {
        userService.sendAuthCode(phoneNumber);
        return phoneNumber;
    }

    //인증번호 받기
    @GetMapping("auth/{phone}")
    public ResponseEntity<Boolean> checkVerification(@PathVariable String phone, @RequestParam String code){
        System.out.println(phone);
        System.out.println(code);

        boolean result = userService.checkAuth(phone, code);

        System.out.println(result);
        if(result) return new ResponseEntity<Boolean>(true,HttpStatus.OK);
        else return new ResponseEntity<Boolean>(false,HttpStatus.FORBIDDEN);

//        if(result) return new CustomizedResponseEntity<Boolean>(StatusCode.OK,ResponseMessage.CONFIRM_CHECK_SUCCESS,true);
//        else return new CustomizedResponseEntity<Boolean>(StatusCode.BAD_REQUEST,ResponseMessage.CONFIRM_CHECK_FAIL,false);
    }
    //회원가입
    @PostMapping("sign-up")
    public void signUp(@RequestBody User user){
        System.out.println(user);
        userService.signUp(user);
//        return "success";
    }

    //로그인
    @PostMapping("sign-in")
    public ResponseEntity<String> signIn(@RequestParam String email, @RequestParam String password){
        System.out.println(email);
        System.out.println(password);

        if(userService.signIn(email,password)) return new ResponseEntity<String>(ResponseMessage.SIGN_IN_SUCCESS,HttpStatus.OK);
        else return new ResponseEntity<String>(ResponseMessage.SIGN_IN_FAIL,HttpStatus.FORBIDDEN);
    }

    //회원정보 변경
    @PostMapping("update")
    public String updateUserInfo(@RequestBody User user){
        userService.changeUserInfo(user);

        return "success";
    }
}
