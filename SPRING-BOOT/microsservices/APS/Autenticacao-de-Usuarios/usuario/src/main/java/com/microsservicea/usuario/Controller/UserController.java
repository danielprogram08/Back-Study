// Controlador

package com.microsservicea.usuario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.microsservicea.usuario.Model.Entity.User;
import com.microsservicea.usuario.Model.Service.UserService;

@Controller
@RequestMapping("/usuario")
public class UserController {
    
    @Autowired
    private UserService service;
    
    // Cadastrar Usuário;
    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody User data) {
        service.registerUser(data);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário cadastrado com sucesso!");
    }

    // Logar Usuário;
    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody User data) {
        service.loginUser(data);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário logado com sucesso!");
    }

    // Atualizar dados do Usuário;
    @PutMapping("/update")
    public ResponseEntity updateUser(@RequestParam Long id, @RequestBody User data) {
        service.updateUser(id, data);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário atualizado com sucesso!");
    }

    // Encerrar Conta;
    @DeleteMapping("/delete")
    public ResponseEntity deleteUser(@RequestParam Long id) {
        service.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso!");
    }

}