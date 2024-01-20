package com.learn2.learn2.global.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn2.learn2.global.AppResponse;

@RestControllerAdvice
public class ErrorHandler {
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<AppResponse<String>> illegalArgumentExceptionHandler(IllegalArgumentException e) {
        final AppResponse<String> response = new AppResponse<>();
        response.setCode(HttpStatus.BAD_REQUEST.value());
        response.setErrorMessage("Bad request!");
        response.setMessage("");
        return ResponseEntity.badRequest().body(response);
    }

}
