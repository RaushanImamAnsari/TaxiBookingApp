package com.R_Uber.TaxiBookingApp.Controller;

import com.R_Uber.TaxiBookingApp.DTO.request.CustomerRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.CustomerResponse;
import com.R_Uber.TaxiBookingApp.Enum.Gender;
import com.R_Uber.TaxiBookingApp.Model.Customer;
import com.R_Uber.TaxiBookingApp.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.addCustomer(customerRequest);
    }

    @GetMapping("/get/customer-id/{id}")
    public CustomerResponse getCustomer(@PathVariable("id") int customerId){
        return customerService.getCustomer(customerId);
    }

    @GetMapping("/getByGender/{gender}")
    public List<CustomerResponse> getAllByGender(@PathVariable("gender") Gender gender){
        return customerService.getAllyByGender(gender);
    }

    @GetMapping("/getAgeAndGender")
    public List<CustomerResponse>getAllByAgeAndGender(@RequestParam("age") int age,
                                                      @RequestParam("gender") Gender gender){
        return customerService.getAllByAgeAndGender(age,gender);
    }


    @GetMapping("/getCustomers")
    public List<CustomerResponse> getAllCustomer(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/genderAndAgeGreaterThan")
    public List<CustomerResponse> getByGenderAndAgeGreaterThan(@RequestParam("age") int age,
                                                               @RequestParam("gender") Gender gender){
        return customerService.getByGenderAndAgeGreaterThan(age, gender);
    }
}
