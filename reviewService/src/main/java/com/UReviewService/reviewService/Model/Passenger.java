package com.UReviewService.reviewService.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger extends BaseModel{

    @Column
    private String name;



    @OneToMany(mappedBy = "passenger")
    private List<Booking> Bookings=new ArrayList<>();
}
