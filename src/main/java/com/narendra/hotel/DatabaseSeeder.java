package com.narendra.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        HotelBooking hotelBooking = new HotelBooking("Marriot",200.4,3);
        bookingRepository.save(hotelBooking);
        bookingRepository.save(new HotelBooking("Taj",130.4,3));
        bookingRepository.save(new HotelBooking("Ibis",90.4,3));

         bookingRepository.save(hotelBooking);
    }
}
