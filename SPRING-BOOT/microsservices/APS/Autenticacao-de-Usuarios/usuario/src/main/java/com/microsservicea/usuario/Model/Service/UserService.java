// Criador;
package com.microsservicea.usuario.Model.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsservicea.usuario.Handler.Exceptions.BadRequestExceptionError;
import com.microsservicea.usuario.Model.Client.UserClient;
import com.microsservicea.usuario.Model.Entity.User;
import com.microsservicea.usuario.Model.Entity.UserClientDTO;
import com.microsservicea.usuario.Model.Entity.UserDTO;
import com.microsservicea.usuario.Model.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserClient userClient;

    // Cadastrar Usuário;
    @Transactional
    public UserDTO registerUser(User data) {
        if (repository.existsByEmail(data.getEmail())) { 
            throw new BadRequestExceptionError("Usuário já cadastrado!"); 
        }
        UserClientDTO clientDTO = new UserClientDTO(data.getName(), data.getEmail());
        userClient.sendUserByEmail(clientDTO);
        UserDTO dto = new UserDTO(data.getName(), data.getEmail(), data.getPassword());
        repository.save(dto.convert());
        return dto;
    }

    // Logar Usuário;
    @Transactional(readOnly = true)
    public Optional<UserDTO> loginUser(User data) {
        if (!repository.existsByEmail(data.getEmail())) {
            throw new BadRequestExceptionError("Usuário não encontrado!");
        }

        UserDTO dto = new UserDTO(data.getName(), data.getEmail(), data.getPassword());
        dto.convert();
        repository.findByEmailAndPassword(dto.email(), dto.password());
        return Optional.of(dto);
    }

    // Atualizar Usuário;
    @Transactional
    public UserDTO updateUser(Long id, User data) {
        if (!repository.existsById(id)) {
            throw new BadRequestExceptionError("Usuário não encontrado!");
        }

        UserDTO dto = new UserDTO(data.getName(), data.getEmail(), data.getPassword());
        dto.convert();
        repository.updateUser(data.getId(), dto.email(), dto.password());
        return dto;
    }

    // Encerrar Conta;
    @Transactional
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}