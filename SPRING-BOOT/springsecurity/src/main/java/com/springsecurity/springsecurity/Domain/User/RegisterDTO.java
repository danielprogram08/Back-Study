package com.springsecurity.springsecurity.Domain.User;

public record RegisterDTO(String login, String password, UserRole role) {}