// Baixo Acoplamento;

package com.microsservicea.usuario.Model.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.microsservicea.usuario.Model.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    @Modifying
    @Query
    (value = "UPDATE FROM usuarios SET email = (:email), password = (:password) WHERE id = (:id)", nativeQuery = true)
    void updateUser(Long id, String email, String password);
    
}