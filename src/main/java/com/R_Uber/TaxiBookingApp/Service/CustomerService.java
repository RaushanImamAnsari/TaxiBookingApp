package com.R_Uber.TaxiBookingApp.Service;

import com.R_Uber.TaxiBookingApp.DTO.request.CustomerRequest;
import com.R_Uber.TaxiBookingApp.DTO.response.CustomerResponse;
import com.R_Uber.TaxiBookingApp.Enum.Gender;
import com.R_Uber.TaxiBookingApp.Model.Customer;
import com.R_Uber.TaxiBookingApp.Repository.CustomerRepository;
import com.R_Uber.TaxiBookingApp.exception.CustomerNotFoundException;
import com.R_Uber.TaxiBookingApp.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        //RequestDTO to entity conversion
        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);

        // save the entity in Db
        Customer savedCustomer = customerRepository.save(customer);

        // Entity to ResponseDTO
        return CustomerTransformer.customerToCustomerResponse(savedCustomer);
    }

    public CustomerResponse getCustomer(int customerId){

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("Invalid Customer Id");

        }
        Customer savedCustomer = optionalCustomer.get();

        // Entity to ResponseDTO
        return CustomerTransformer.customerToCustomerResponse(savedCustomer);
    }



    //fetching data on the basis of gender

    public List<CustomerResponse> getAllyByGender(Gender gender) {

        List<Customer> customers = customerRepository.findByGender(gender);

        //entity to DTO

        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer : customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;
    }

    //fetching data on the basis of age and gender

    public List<CustomerResponse> getAllByAgeAndGender(int age, Gender gender) {
        List<Customer> customers = customerRepository.findByAgeAndGender(age,gender);

        // Entity to DTO

        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer : customers ){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }

        return customerResponses;
    }


    public List<CustomerResponse> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        // Entity to DTO

        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer : customers ){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }

        return customerResponses;
    }

    public List<CustomerResponse> getByGenderAndAgeGreaterThan(int age, Gender gender) {
        List<Customer> customers = customerRepository.getByGenderAndAgeGreaterThan(age, gender);

        // entity to responseDTO
        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer: customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;
    }
}
