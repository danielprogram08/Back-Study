package com.microsserviceb.email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microsserviceb.email.Model.Entity.Email;
import com.microsserviceb.email.Model.Services.EmailService;

@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService service;

    @PostMapping("/send")
    public ResponseEntity sendEmail(@RequestBody Email data) {
        service.sendEmail(data);
        return ResponseEntity.status(HttpStatus.OK).body("Email enviado com sucesso!");
    }
}
