package com.example.icebreaking.domain.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BalanceGame{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String solution1;
    private String solution2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolution1() {
        return solution1;
    }

    public void setSolution1(String solution1) {
        this.solution1 = solution1;
    }

    public String getSolution2() {
        return solution2;
    }

    public void setSolution2(String solution2) {
        this.solution2 = solution2;
    }
}