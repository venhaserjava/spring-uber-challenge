package com.venhaserjava.spring_uber_challenge.application;

import com.venhaserjava.spring_uber_challenge.adapters.EmailSenderGateway;
import com.venhaserjava.spring_uber_challenge.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService  implements EmailSenderUseCase {

    private  final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void SendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to,subject,body);
    }
}
