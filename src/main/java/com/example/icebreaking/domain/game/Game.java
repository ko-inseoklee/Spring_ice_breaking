package com.example.icebreaking.domain.game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "game")
@NoArgsConstructor
@Getter @Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String category;

    public Game(Long id, String category) {
        this.id = id;
        this.category = category;
    }


    public Game(String c){
        this.category = c;
    }
}