package com.venhaserjava.spring_uber_challenge.core;

public interface EmailSenderUseCase {
    void SendEmail(String to, String subject, String body);
}
