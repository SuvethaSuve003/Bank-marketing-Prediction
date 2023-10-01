package com.demo.exceptions;

public class InvalidYearException extends RuntimeException{
    private String  validYears;

    public String getValidYears() {
        return validYears;
    }

    public void setValidYears(String validYears) {
        this.validYears = validYears;
    }

    public InvalidYearException(String message, String validYears) {
        super(message);
        this.validYears = validYears;
    }
}
