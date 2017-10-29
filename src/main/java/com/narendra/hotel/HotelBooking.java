package com.narendra.hotel;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Raghu on 25-Oct-17.
 */

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id ;
    private String hotelName;
    private double pricePerNight;
    private int nbOfNight;

    public HotelBooking() {
            }

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNight) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNight = nbOfNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNbOfNight() {
        return nbOfNight;
    }

    public void setNbOfNight(int nbOfNight) {
        this.nbOfNight = nbOfNight;
    }
}
