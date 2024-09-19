package com.venhaserjava.spring_uber_challenge.core.exceptions;

import com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException;

public class EmailServiceException extends RuntimeException {
    public EmailServiceException(String message){
        super(message);
    }
    public  EmailServiceException(String message, Throwable cause){
        super(message,cause);
    }
}
