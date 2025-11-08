package com.microsserviceb.email.Handler;

public class BadRequestExceptionError extends RuntimeException{
    public BadRequestExceptionError(String message) {
        super(message);
    }
}