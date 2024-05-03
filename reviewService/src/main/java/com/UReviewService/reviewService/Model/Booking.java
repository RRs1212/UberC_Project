package com.UReviewService.reviewService.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking extends BaseModel{
    @Enumerated(value = EnumType.STRING)
    private  Booking_Status bookingStatus;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date start;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date End;

    private long distance;

    @OneToOne(fetch = FetchType.LAZY)
    private BookingReview bookingReview;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Driver driver;
}
