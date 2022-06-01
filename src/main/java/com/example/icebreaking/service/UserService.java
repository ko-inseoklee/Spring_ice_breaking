package com.example.icebreaking.service;

import com.example.icebreaking.domain.User;
import com.example.icebreaking.repository.user.UserRepository;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ConfirmService confirmService;
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository, CoolMessage coolMessage, ConfirmService confirmService) {
        this.userRepository = userRepository;
        this.confirmService = confirmService;
    }

    public void signUp(User user){
        try{
            user.setPassword(encoder.encode(user.getPassword()));
            userRepository.save(user);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    //로그인

    public boolean signIn(String id,String password){
        Optional<User> user = userRepository.findByEmailEquals(id);

        if(user.isPresent()) {
            return (encoder.matches(password,user.get().getPassword()));
        }
        return false;
    }

    public void sendAuthCode(String phoneNumber) throws CoolsmsException {
        confirmService.sendMessage(phoneNumber);
    }

    public boolean checkAuth(String phoneNumber, String code ){
        return confirmService.validate(phoneNumber,code);
    }

    public void changeUserInfo(User user){
        userRepository.updateUserInfo(user.getPassword(),user.getNickname(),user.getPhoneNumber(),user.getEmail());
    }
    //인증메일 발송
    //회원정보 변경
}
