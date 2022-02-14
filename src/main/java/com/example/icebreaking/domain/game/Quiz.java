package com.example.icebreaking.domain.game;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String question;
    private String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}