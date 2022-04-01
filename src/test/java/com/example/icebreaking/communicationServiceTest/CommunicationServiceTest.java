/*
package com.example.icebreaking.communicationServiceTest;

import com.example.icebreaking.domain.Communication;
import com.example.icebreaking.service.CommunicationService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
//이미 data가 spring server open 당시에 열려 있는 상황에서 sql 어노테이션을 넣어주면 중복으로 확인하기 때문에 열리지 않는다.
//@Sql({"/sql/data.sql"})
@Transactional
public class CommunicationServiceTest {
    @Autowired
    CommunicationService communicationService;

    @Test
    public void 대화불러오기(){
        Long id = 11L;

        Communication communication = communicationService.loadCommunicationFromID(id);

        Assertions.assertThat(communication.getId()).isEqualTo(1L);
    }

    @Test
    public void 카테고리별대화목록불러오기(){
        String category = "가족";

        List<Communication> communications = communicationService.loadCommunicationsFromCategory(category);

        Assertions.assertThat(communications.size()).isEqualTo(3);
    }

}
*/
