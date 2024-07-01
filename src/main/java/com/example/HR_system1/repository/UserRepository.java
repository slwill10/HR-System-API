package com.example.HR_system1.repository;

import com.example.HR_system1.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
