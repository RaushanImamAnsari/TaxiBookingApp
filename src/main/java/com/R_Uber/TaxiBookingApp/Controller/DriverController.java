package com.R_Uber.TaxiBookingApp.Controller;

import com.R_Uber.TaxiBookingApp.DTO.request.DriverRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.DriverResponse;
import com.R_Uber.TaxiBookingApp.Model.Driver;
import com.R_Uber.TaxiBookingApp.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/add")
    public DriverResponse addDriver(@RequestBody DriverRequest driverRequest){
        return driverService.addDriver(driverRequest);
    }
}
