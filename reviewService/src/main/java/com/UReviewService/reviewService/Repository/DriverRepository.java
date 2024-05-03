package com.UReviewService.reviewService.Repository;

import com.UReviewService.reviewService.Model.Driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

    @Query(nativeQuery = true,value = "select * from driver where id=:id AND license_number=:licenseNumber")
    Optional<Driver> rawfindByIdAndLicenseNumber(Long id,String licenseNumber);

    @Query("SELECT driver\n" +
            "FROM Driver driver\n" +
            "WHERE driver.id = :id AND driver.licenseNumber = :licenseNumber")
    Optional<Driver> hqlfindByIdAndLicenseNumber(Long id,String licenseNumber);









}
