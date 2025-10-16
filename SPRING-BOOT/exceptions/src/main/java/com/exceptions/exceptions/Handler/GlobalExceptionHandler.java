package com.exceptions.exceptions.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.exceptions.exceptions.Exception.EventsNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EventsNotFoundException.class)
private ResponseEntity<RestErrorMessage> eventsNotFoundErrorHandler(EventsNotFoundException exception) {
		RestErrorMessage errorResponse = new RestErrorMessage(HttpStatus.NOT_FOUND.toString(), exception.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
}
}