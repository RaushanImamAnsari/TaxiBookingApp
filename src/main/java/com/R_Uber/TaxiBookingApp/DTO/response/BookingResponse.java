package com.R_Uber.TaxiBookingApp.DTO.response;
import com.R_Uber.TaxiBookingApp.Enum.TripStatus;
import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookingResponse {
    private String pickup;
    private String destination;
    private double distanceTravelledInKM;
    private TripStatus tripStatus;
    private double billAmount;
    Date bookedAt;
    Date lastUpdateAt;
    CustomerResponse  customerResponse;
    CabResponse cabResponse;
}
