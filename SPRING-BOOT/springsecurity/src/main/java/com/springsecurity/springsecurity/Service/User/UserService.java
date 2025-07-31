package com.springsecurity.springsecurity.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.springsecurity.Repository.User.UserRepository;

// Esta camada de serviço não é visível para o Spring Secyrity. Então ele até consegue tratar autenticações via email por essa camada;
@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }

}