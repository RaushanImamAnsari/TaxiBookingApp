package com.R_Uber.TaxiBookingApp.Repository;

import com.R_Uber.TaxiBookingApp.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    @Query(value = "select * from driver where cab_id = :cabId", nativeQuery = true)
    Driver getDriverById(@Param("cabId") int cabId);
}
