package com.R_Uber.TaxiBookingApp.DTO.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DriverRequest {
    private String name;
    private int age;
    private String email;
}
