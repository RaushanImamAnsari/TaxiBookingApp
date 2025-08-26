package com.R_Uber.TaxiBookingApp.transformer;

import com.R_Uber.TaxiBookingApp.DTO.request.CustomerRequest;
import com.R_Uber.TaxiBookingApp.DTO.request.DriverRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.DriverResponse;
import com.R_Uber.TaxiBookingApp.Model.Driver;
import com.R_Uber.TaxiBookingApp.Repository.DriverRepository;

public class DriverTransformer {

   // requestDTO to Entity
    public static Driver driverRequesttoDriver(DriverRequest driverRequest){

        return Driver.builder()
                .name(driverRequest.getName())
                .age(driverRequest.getAge())
                .email(driverRequest.getEmail())
                .build();
    }

    // Entity to ResponseDTO
    public static DriverResponse driverToDriverResponse(Driver savedDriver){

        return DriverResponse.builder()
                .driverId(savedDriver.getDriverId())
                .name(savedDriver.getName())
                .age(savedDriver.getAge())
                .email(savedDriver.getEmail())
                .build();
    }
}
