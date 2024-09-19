package com.venhaserjava.spring_uber_challenge.controllers;

import com.venhaserjava.spring_uber_challenge.application.EmailSenderService;
import com.venhaserjava.spring_uber_challenge.core.EmailRequest;
import com.venhaserjava.spring_uber_challenge.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailService){
        this.emailSenderService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> SendEmail(@RequestBody EmailRequest request){
        try {
            this.emailSenderService.SendEmail(request.to(), request.subject(),request.body());
            return ResponseEntity.ok("Email enviado com Sucesso!");
        } catch (EmailServiceException ex) {
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao enviar Email");
        }
    }

}
