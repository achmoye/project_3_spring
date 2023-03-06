package com.project3.rentals;

import lombok.Data;

@Data
public class RentalsResponse {
    Rental[] rentals;

    public RentalsResponse(){
        rentals = new Rental[3];
        Rental r = new Rental(1, "test house 1", 432, 300,
                "https://blog.technavio.org/wp-content/uploads/2018/12/Online-House-Rental-Sites.jpg",
                "Lorem ipsum dolor sit amet.",
                1,
                "2012/12/02",
                "2014/12/02");
        rentals[0] = r;
    }
}