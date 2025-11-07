package com.microsservicea.usuario.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.microsservicea.usuario.Handler.Exceptions.BadRequestExceptionError;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestExceptionError.class)
    public ResponseEntity<RestErrorMessage> badRequestError(BadRequestExceptionError exception) {
        RestErrorMessage error = new RestErrorMessage(exception.getMessage(), HttpStatus.BAD_REQUEST);
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(error);
    }
}