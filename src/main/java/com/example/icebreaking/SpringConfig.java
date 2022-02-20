package com.example.icebreaking;

import com.example.icebreaking.repository.game.BalanceGameRepository;
import com.example.icebreaking.service.GameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private BalanceGameRepository balanceGameRepository;

    @Bean
    public GameService gameService () {
        return new GameService(balanceGameRepository);
    }
}
