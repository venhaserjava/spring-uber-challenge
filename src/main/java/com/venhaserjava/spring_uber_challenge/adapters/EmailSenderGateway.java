package com.venhaserjava.spring_uber_challenge.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
