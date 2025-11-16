package com.microsserviceb.email.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsserviceb.email.Handler.BadRequestExceptionError;
import com.microsserviceb.email.Model.Entity.Email;
import com.microsserviceb.email.Model.Entity.EmailDTO;
import com.microsserviceb.email.Model.Repository.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;

    // Salvar Email;
    public EmailDTO sendEmail(Email data) {
        if (data.getName() == null || data.getEmail() == null) {
            throw new BadRequestExceptionError("Dados inválidos!");
        }

        EmailDTO dto = new EmailDTO(data.getName(), data.getEmail());
        repository.save(dto.convert());
        return dto;
    }

    // Listar Emails;
    @Transactional(readOnly = true)
    public List<Email> listAllEmails() {
        return repository.findAll();
    }
}