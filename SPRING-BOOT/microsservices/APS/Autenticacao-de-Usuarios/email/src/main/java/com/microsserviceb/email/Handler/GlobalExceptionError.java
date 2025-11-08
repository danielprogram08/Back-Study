package com.microsserviceb.email.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionError extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestExceptionError.class)
    private ResponseEntity<RestErrorMessage> BadRequestExceptionError(BadRequestExceptionError e) {
        RestErrorMessage error = new RestErrorMessage(HttpStatus.BAD_REQUEST, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
        
}
