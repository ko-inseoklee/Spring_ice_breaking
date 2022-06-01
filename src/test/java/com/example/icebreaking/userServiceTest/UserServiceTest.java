//package com.example.icebreaking.userServiceTest;
//
//import com.example.icebreaking.domain.Confirm;
//import com.example.icebreaking.service.ConfirmService;
//import com.example.icebreaking.service.UserService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class UserServiceTest {
//    @Autowired
//    UserService userService;
//
//    @Autowired
//    ConfirmService confirmService;
//
//    @Test
//    public void checkConfirm(){
//        Confirm confirm = confirmService.getConfirm("01027765098");
//
//        Assertions.assertThat(confirm.getValidationNumber()).isEqualTo("6384");
//    }
//}
