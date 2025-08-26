package com.R_Uber.TaxiBookingApp.exception;

public class DriverNotFoundException extends RuntimeException {

    public DriverNotFoundException(String message){
        super(message);
    }

}
