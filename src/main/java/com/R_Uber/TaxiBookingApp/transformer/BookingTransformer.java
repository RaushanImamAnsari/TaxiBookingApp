package com.R_Uber.TaxiBookingApp.transformer;

import com.R_Uber.TaxiBookingApp.DTO.request.BookingRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.BookingResponse;
import com.R_Uber.TaxiBookingApp.DTO.response.CabResponse;
import com.R_Uber.TaxiBookingApp.DTO.response.CustomerResponse;
import com.R_Uber.TaxiBookingApp.Enum.TripStatus;
import com.R_Uber.TaxiBookingApp.Model.Booking;
import com.R_Uber.TaxiBookingApp.Model.Cab;
import com.R_Uber.TaxiBookingApp.Model.Customer;
import com.R_Uber.TaxiBookingApp.Model.Driver;

public class BookingTransformer {

    //requestDTO to entity
    public static Booking bookingRequestTOBooking(BookingRequest bookingRequest, double perKmRate){
        return Booking.builder()
                .pickup(bookingRequest.getPickup())
                .destination(bookingRequest.getDestination())
                .distanceTravelledInKM(bookingRequest.getDistanceTravelledInKM())
                .tripStatus(TripStatus.IN_PROGRESS)
                .billAmount(bookingRequest.getDistanceTravelledInKM()*perKmRate)
                .build();
    }


    //Entity to ResponseDTO
    public static BookingResponse bookingToBookingResponse(Booking savedBooking,
                                                           Customer customer,
                                                           Cab cab, Driver driver){
        return BookingResponse.builder()
                .pickup(savedBooking.getPickup())
                .destination(savedBooking.getDestination())
                .distanceTravelledInKM(savedBooking.getBookingId())
                .tripStatus(savedBooking.getTripStatus())
                .billAmount(savedBooking.getBillAmount())
                .bookedAt(savedBooking.getBookedAt())
                .lastUpdateAt(savedBooking.getLastUpdateAt())
                .customerResponse(CustomerTransformer.customerToCustomerResponse(customer))
                .cabResponse(CabTransformer.cabToCabResponse(cab,driver))
                .build();
    }
}
