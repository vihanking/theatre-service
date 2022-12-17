package com.adp.theatreservice.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class TheatreExceptionHandler {

    @ExceptionHandler(TheatreNotFoundException.class)
    public ResponseEntity<Error> handleTheatreNotFoundException(TheatreNotFoundException ex){
        Error error=new Error();
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setDate(new Date());
        return ResponseEntity.badRequest().body(error);
    }
}

@Data
class Error{
    private String message;
    private int status;
    private Date date;
}