package com.microsserviceb.email.Model.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsserviceb.email.Model.Entity.Email;

public interface EmailRepository extends JpaRepository<Email, UUID>{}