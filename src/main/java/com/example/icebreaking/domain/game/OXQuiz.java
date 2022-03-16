package com.example.icebreaking.domain.game;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ox_quiz")
@Getter @Setter
public class OXQuiz {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String question;
    private boolean answer;
}