package com.R_Uber.TaxiBookingApp.transformer;

import com.R_Uber.TaxiBookingApp.DTO.request.CustomerRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.CustomerResponse;
import com.R_Uber.TaxiBookingApp.Model.Customer;

public class CustomerTransformer {

    // requestDTO to Entity
    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){

//        Customer customer =  new Customer();
//        customer.setName(customerRequest.getName());
//        customer.setAge(customerRequest.getAge());
//        customer.setEmail(customerRequest.getEmail());
//        customer.setGender(customerRequest.getGender());
//        return customer;
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .email(customerRequest.getEmail())
                .gender(customerRequest.getGender())
                .build();

    }

    // Entity To responseDTO
    public static CustomerResponse customerToCustomerResponse(Customer savedCustomer){
//        CustomerResponse customerResponse = new CustomerResponse();
//        customerResponse.setName(savedCustomer.getName());
//        customerResponse.setAge(savedCustomer.getAge());
//        customerResponse.setEmail(savedCustomer.getEmail());
//
//        return customerResponse;
        return CustomerResponse.builder()
                .name(savedCustomer.getName())
                .age(savedCustomer.getAge())
                .email(savedCustomer.getEmail())
                .build();
    }
}
