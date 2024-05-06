package com.UReviewService.reviewService.Repository;

import com.UReviewService.reviewService.Model.Booking;
import com.UReviewService.reviewService.Model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface PassengerRepository extends JpaRepository<Passenger,Long> {



//    Optional<Passenger> findByName(String Name);
//
//    Optional<Passenger> findById(Long id);





}
