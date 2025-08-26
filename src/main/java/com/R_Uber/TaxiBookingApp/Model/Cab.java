package com.R_Uber.TaxiBookingApp.Model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cabId;

    @Column(unique = true)
    private String cabNumber;
    private String cabModel;
    private double perKmRate;
    private boolean available;


}
