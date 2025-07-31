package com.springsecurity.springsecurity.Repository.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.springsecurity.springsecurity.Domain.User.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
    UserDetails findByLogin(String login);
}