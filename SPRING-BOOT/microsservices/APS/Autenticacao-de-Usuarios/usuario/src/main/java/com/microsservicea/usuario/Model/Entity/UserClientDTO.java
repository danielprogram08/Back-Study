package com.microsservicea.usuario.Model.Entity;

public record UserClientDTO(String name, String email) {
    public User convertTo() {
        User data = new User();
        data.setName(this.name);
        data.setEmail(this.email);
        return data;
    }
}
