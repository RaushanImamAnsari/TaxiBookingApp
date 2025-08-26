package com.R_Uber.TaxiBookingApp.Service;

import com.R_Uber.TaxiBookingApp.DTO.request.DriverRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.DriverResponse;
import com.R_Uber.TaxiBookingApp.Model.Driver;
import com.R_Uber.TaxiBookingApp.Repository.DriverRepository;
import com.R_Uber.TaxiBookingApp.transformer.DriverTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public DriverResponse addDriver(DriverRequest driverRequest) {

        // DTO to Entity
        Driver driver = DriverTransformer.driverRequesttoDriver(driverRequest);

        // saving the Entity in db
        Driver savedDriver  = driverRepository.save(driver);

        // Entity to DTO
        return DriverTransformer.driverToDriverResponse(savedDriver);
    }
}
