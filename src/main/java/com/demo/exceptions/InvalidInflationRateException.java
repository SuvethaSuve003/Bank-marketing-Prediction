package com.demo.exceptions;

public class InvalidInflationRateException extends RuntimeException{
    public InvalidInflationRateException(String message) {
        super(message);
    }
}
