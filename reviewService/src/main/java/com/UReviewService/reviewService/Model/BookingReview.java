package com.UReviewService.reviewService.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Builder
@Entity
public class BookingReview extends BaseModel {

    @Column(nullable = false)
     private String BookingReviewContent;

    @Column(nullable = false)
    private Double rating;




}

