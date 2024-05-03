package com.UReviewService.reviewService.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DriverReview extends BookingReview {

    @Column(nullable = false)
    private String DriverReviewContent;

    @Column(nullable = false)
    private String DriverReviewRating;
}
