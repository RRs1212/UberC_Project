package com.UReviewService.reviewService.Repository;

import com.UReviewService.reviewService.Model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PassengerRepository extends JpaRepository<Passenger,Long> {


}
