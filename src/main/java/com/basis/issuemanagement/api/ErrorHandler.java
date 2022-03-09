package com.basis.issuemanagement.api;

import com.basis.issuemanagement.exceptions.ProjectNotFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(ProjectNotFoundError.class)
    public ResponseEntity<?> handleProjectNotFoundError() {
        return new ResponseEntity<>("Project not exist with this ıd", HttpStatus.NOT_ACCEPTABLE);
    }
}
