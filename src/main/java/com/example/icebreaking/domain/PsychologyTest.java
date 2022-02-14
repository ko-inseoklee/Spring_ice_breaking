package com.example.icebreaking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "psychologyTest")
public class PsychologyTest {
    @Id
    @Column(nullable = false)
    private String category;
    private String resultReference;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResultReference() {
        return resultReference;
    }

    public void setResultReference(String resultReference) {
        this.resultReference = resultReference;
    }
}