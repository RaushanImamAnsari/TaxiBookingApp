package com.R_Uber.TaxiBookingApp.DTO.request;

import com.R_Uber.TaxiBookingApp.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerRequest {

    private String name;
    private int age;
    private String email;
    private Gender gender;
}
