package com.empresascrud.backend.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<String> ManejarResponseStatusException(ResponseStatusException ex) {
        ResponseEntity<String> responseEntity = ResponseEntity.status(ex.getStatusCode()).body(ex.getReason());
        return responseEntity;
    }

}
