package com.pairlearn.ExpenseTracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EtBadRequestExeption extends RuntimeException{
    public EtBadRequestExeption(String message){
        super(message);
    }
}
