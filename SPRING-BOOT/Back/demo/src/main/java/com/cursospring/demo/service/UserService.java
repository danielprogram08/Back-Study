package com.cursospring.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.demo.entity.User;
import com.cursospring.demo.repository.TaskRepository;
import com.cursospring.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private TaskRepository repository2;
    
    public Optional<User> findById(Long Id) {
        Optional<User> user = repository.findById(Id);
        return user;
    }
}
