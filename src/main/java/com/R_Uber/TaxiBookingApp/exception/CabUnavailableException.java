package com.R_Uber.TaxiBookingApp.exception;

public class CabUnavailableException extends RuntimeException{

    public CabUnavailableException(String message){
        super(message);
    }
}
