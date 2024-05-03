package com.UReviewService.reviewService.Services;

import com.UReviewService.reviewService.Model.Booking;
import com.UReviewService.reviewService.Model.BookingReview;
import com.UReviewService.reviewService.Model.Driver;
import com.UReviewService.reviewService.Repository.BookingRepository;
import com.UReviewService.reviewService.Repository.DriverRepository;
import com.UReviewService.reviewService.Repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    private BookingRepository bookingRepository;

    private DriverRepository driverRepository;

    public  ReviewService (ReviewRepository reviewRepository,BookingRepository bookingRepository,
                           DriverRepository driverRepository){
        this.reviewRepository=reviewRepository;

        this.bookingRepository=bookingRepository;

        this.driverRepository=driverRepository;

    }

    @Override
    public void run(String... args) throws Exception {
//
//        BookingReview r= BookingReview.builder()
//                .BookingReviewContent("Not great ")
//                .rating(1.0)
//                .build();
//
////        reviewRepository.save(r);
//
//        Booking booking=Booking.builder()
//                .bookingReview(r)
//                .End(new Date())
//                .distance(12)
//                .build();

//        bookingRepository.save(booking);


//        List<BookingReview> reviews =reviewRepository.findAll();
//
//        for(BookingReview BR:reviews){
//            System.out.println(BR.getBookingReviewContent());
//
//
//        Optional<Booking> b=bookingRepository.findById(2L);
//
//        if(b.isPresent()){
//            bookingRepository.delete(b.get());
//        }

//        reviewRepository.deleteById(1L);


//        System.out.println(bookingRepository.count());

//        bookingRepository.


//       Optional<Driver> driver=driverRepository.rawfindByIdAndLicenseNumber(1L,"Ap234");
//
//        if(driver.isPresent()){
//            System.out.println(driver.get().getCreatedAt());
//
//        }

//        Optional<Booking> booking1=bookingRepository.findBydistance(8L);
//
//        if(booking1.isPresent()){
//            System.out.println(booking1.get().getPassenger().getName());
//
//        }

//        Optional<Driver> driver1=driverRepository.hqlfindByIdAndLicenseNumber(1L,"Ap234");
//
//        if(driver1.isPresent()){
//            System.out.println(driver.get().getCreatedAt());
////
////        }
//
//
//        List<Booking> bookings=bookingRepository.findAllByDriverId(1L);
//
////        if(bookings.isPresent()){
////            List<Booking>bookingList=bookings.get().get
////        }
//        for(Booking b:bookings){
//            System.out.println(b.getId());


        Optional<Driver> driver=driverRepository.findById(1L);
        if(driver.isPresent()) {
            List<Booking> b=driver.get().getBookings();
            for(Booking booking:b){
                booking.getPassenger();
            }
        }


















    }
}
