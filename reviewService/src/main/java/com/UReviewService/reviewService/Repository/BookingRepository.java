package com.UReviewService.reviewService.Repository;

import com.UReviewService.reviewService.Model.Booking;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {



//    List<Booking> findAllByDriverId(Long id);


    List<Booking> findAllByPassengerName(String Name);

    Optional<Booking>findById(Long id);


}
