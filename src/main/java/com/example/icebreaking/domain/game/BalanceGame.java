package com.example.icebreaking.domain.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BalanceGame{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String solution1;
    private String solution2;
}