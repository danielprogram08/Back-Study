// Criador;

package com.microsservicea.usuario.Model.Service;

// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsservicea.usuario.Handler.Exceptions.BadRequestExceptionError;
import com.microsservicea.usuario.Model.Entity.User;
import com.microsservicea.usuario.Model.Entity.UserDTO;
import com.microsservicea.usuario.Model.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    // Cadastrar Usuário;
    @Transactional
    public UserDTO registerUser(User data) {
        if (repository.existsByEmail(data.getEmail())) { 
            throw new BadRequestExceptionError("Usuário já cadastrado!"); 
        }

        UserDTO dto = new UserDTO(data.getName(), data.getEmail(), data.getPassword());
        repository.save(dto.convert());
        return dto;
    }

    /*  Cadastrar Usuário via Gmail;
    @Transactional
    public UserDTO registerWithGmail(User data) {} */
}