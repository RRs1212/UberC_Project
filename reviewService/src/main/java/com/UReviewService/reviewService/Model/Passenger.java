package com.UReviewService.reviewService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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


    private String Name;

  @OneToMany(mappedBy = "passenger")
    private List<Booking> Bookings=new ArrayList<>();
}
