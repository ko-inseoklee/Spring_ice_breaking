package com.example.icebreaking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log")
public class Log {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String category;
    private Long gameID;
    private Long communicationID;
    private String MBTIResult;
    private String attachmentResult;
    private String perspectiveResult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getGameID() {
        return gameID;
    }

    public void setGameID(Long gameID) {
        this.gameID = gameID;
    }

    public Long getCommunicationID() {
        return communicationID;
    }

    public void setCommunicationID(Long communicationID) {
        this.communicationID = communicationID;
    }

    public String getMBTIResult() {
        return MBTIResult;
    }

    public void setMBTIResult(String MBTIResult) {
        this.MBTIResult = MBTIResult;
    }

    public String getAttachmentResult() {
        return attachmentResult;
    }

    public void setAttachmentResult(String attachmentResult) {
        this.attachmentResult = attachmentResult;
    }

    public String getPerspectiveResult() {
        return perspectiveResult;
    }

    public void setPerspectiveResult(String perspectiveResult) {
        this.perspectiveResult = perspectiveResult;
    }
}