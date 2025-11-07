// Baixo Acoplamento;

package com.microsservicea.usuario.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservicea.usuario.Model.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}