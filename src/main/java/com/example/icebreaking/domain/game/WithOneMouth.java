package com.example.icebreaking.domain.game;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "with_one_mouth")
public class WithOneMouth {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String words1;
    private String words2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWords1() {
        return words1;
    }

    public void setWords1(String words1) {
        this.words1 = words1;
    }

    public String getWords2() {
        return words2;
    }

    public void setWords2(String words2) {
        this.words2 = words2;
    }
}