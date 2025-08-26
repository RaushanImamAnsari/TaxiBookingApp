package com.R_Uber.TaxiBookingApp.Repository;

import com.R_Uber.TaxiBookingApp.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
