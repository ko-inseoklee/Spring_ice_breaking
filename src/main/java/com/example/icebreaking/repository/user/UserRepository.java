package com.example.icebreaking.repository.user;

import com.example.icebreaking.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}