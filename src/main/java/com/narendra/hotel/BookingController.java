package com.narendra.hotel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Raghu on 25-Oct-17.
 */

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

/*    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<HotelBooking> getAll() {
        return  bookingRepository.findAll();
    }*/

    @RequestMapping(value = "/all", method = RequestMethod.GET)
   public Iterable<HotelBooking> getAll()
    {
        return  bookingRepository.findAll();
    }


    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price) {
        return bookingRepository.findByPricePerNightLessThan(price);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Iterable<HotelBooking> create(@RequestBody HotelBooking hotelBooking) {
        bookingRepository.save(hotelBooking);
        return bookingRepository.findAll();
    }

 /*   @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
     public Iterable<HotelBooking> remove(@PathVariable long id){
        bookingRepository.delete(id);

        return bookingRepository.findAll();
    }*/
}
