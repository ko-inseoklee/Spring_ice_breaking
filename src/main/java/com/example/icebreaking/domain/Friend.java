package com.example.icebreaking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friends")
public class Friend {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private Long friendID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFriendID() {
        return friendID;
    }

    public void setFriendID(Long friendID) {
        this.friendID = friendID;
    }
}