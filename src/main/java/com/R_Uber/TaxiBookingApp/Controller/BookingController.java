package com.R_Uber.TaxiBookingApp.Controller;

import com.R_Uber.TaxiBookingApp.DTO.request.BookingRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.BookingResponse;
import com.R_Uber.TaxiBookingApp.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/book/customer/{customerId}")
    public BookingResponse bookCab(@RequestBody BookingRequest bookingRequest,
                                   @PathVariable("customerId") int customerid){
        return bookingService.bookCab(bookingRequest,customerid);
    }

}
