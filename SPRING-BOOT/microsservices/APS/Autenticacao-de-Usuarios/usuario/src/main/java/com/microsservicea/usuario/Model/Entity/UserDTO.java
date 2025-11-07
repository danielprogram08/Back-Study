package com.microsservicea.usuario.Model.Entity;

public record UserDTO(String name, String email, String password) {

    public User convert() {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
}