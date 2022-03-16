package com.example.icebreaking.domain.game;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "with_one_mouth")
@Getter @Setter
public class WithOneMouth {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String words1;
    private String words2;

}