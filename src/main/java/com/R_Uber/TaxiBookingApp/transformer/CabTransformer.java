package com.R_Uber.TaxiBookingApp.transformer;

import com.R_Uber.TaxiBookingApp.DTO.request.CabRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.CabResponse;
import com.R_Uber.TaxiBookingApp.Model.Cab;
import com.R_Uber.TaxiBookingApp.Model.Driver;

public class CabTransformer {

    //requestDTO to Entity
    public static Cab cabRequestToCab(CabRequest cabRequest){
        return Cab.builder()
                .cabNumber(cabRequest.getCabNumber())
                .cabModel(cabRequest.getCabModel())
                .perKmRate(cabRequest.getPerKmRate())
                .available(true)
                .build();
    }


    // Entity to DTO

    public static CabResponse cabToCabResponse(Cab savedCab, Driver driver){
        return CabResponse.builder()
                .cabNumber(savedCab.getCabNumber())
                .cabModel(savedCab.getCabModel())
                .perKmRate(savedCab.getPerKmRate())
                .available(savedCab.isAvailable())
                .driver(DriverTransformer.driverToDriverResponse(driver))
                .build();
    }

}
