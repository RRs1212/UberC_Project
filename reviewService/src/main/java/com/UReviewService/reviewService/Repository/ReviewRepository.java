package com.UReviewService.reviewService.Repository;

import com.UReviewService.reviewService.Model.BookingReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<BookingReview,Long> {

}
