package com.example.icebreaking.domain.game;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "start_game")
@Getter @Setter
public class StartGame {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String question;
    private String example;
}