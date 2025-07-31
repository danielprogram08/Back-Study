package com.springsecurity.springsecurity.Domain.User;

// Enums para armazenar os tipos de Roles (Regras);
public enum UserRole {

    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole (String role) {
        this.role = role;
    }

    public String getRole () {
        return role;
    }
}