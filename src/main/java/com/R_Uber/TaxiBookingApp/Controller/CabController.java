package com.R_Uber.TaxiBookingApp.Controller;

import com.R_Uber.TaxiBookingApp.DTO.request.CabRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.CabResponse;
import com.R_Uber.TaxiBookingApp.Repository.CabRepository;
import com.R_Uber.TaxiBookingApp.Service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")
public class CabController {

    @Autowired
    CabService cabService;

    @PostMapping("/register/driver/{driverId}")
    public CabResponse registerCab(@RequestBody CabRequest cabRequest,
                                   @PathVariable("driverId") int driverId){
        return cabService.registerCab(cabRequest,driverId);
    }
}
