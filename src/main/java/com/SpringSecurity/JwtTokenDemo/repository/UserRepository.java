package com.SpringSecurity.JwtTokenDemo.repository;

import com.SpringSecurity.JwtTokenDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
