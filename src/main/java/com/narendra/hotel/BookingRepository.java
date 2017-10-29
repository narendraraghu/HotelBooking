package com.narendra.hotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<HotelBooking,Long> {

    List<HotelBooking> findByPricePerNightLessThan(double price);

}