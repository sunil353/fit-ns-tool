package com.fitns.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductException extends Exception{

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> productException(Exception exception){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("product id invalid "+exception);
    }

    /*@ExceptionHandler
    public ResponseEntity<String> productNameException(Exception exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(" for name exception "+exception);
    }*/

}
