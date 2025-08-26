package com.R_Uber.TaxiBookingApp.Repository;

import com.R_Uber.TaxiBookingApp.Enum.Gender;
import com.R_Uber.TaxiBookingApp.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

   List<Customer> findByGender(Gender gender);
   List<Customer> findByAgeAndGender(int age,Gender gender);


   @Query("Select c from Customer c where c.age > :age and c.gender  = :gender") //HQL(hibernate query language)
   List<Customer> getByGenderAndAgeGreaterThan(@Param("age") int age,
                                               @Param("gender") Gender gender);
}
