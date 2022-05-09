package com.example.icebreaking.repository.user;

import com.example.icebreaking.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailEquals(String email);

    @Transactional
    @Modifying
    @Query("update User u set u.password = ?1, u.nickname = ?2, u.phoneNumber = ?3 where u.email = ?4")
    void updateUserInfo(String password, String nickname, String phoneNumber, String email);
}