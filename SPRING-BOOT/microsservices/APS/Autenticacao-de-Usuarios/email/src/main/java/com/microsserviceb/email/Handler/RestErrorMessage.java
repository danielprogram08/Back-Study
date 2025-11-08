package com.microsserviceb.email.Handler;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RestErrorMessage {

    private HttpStatus status;
    private String message;
}
