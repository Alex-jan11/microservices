package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException{

    public ResouceNotFoundException(String message, String fieldName, String fieldValue) {
        super(String.format("%s not found with the given input %s : '%s'", message, fieldName, fieldValue));
    }
}
