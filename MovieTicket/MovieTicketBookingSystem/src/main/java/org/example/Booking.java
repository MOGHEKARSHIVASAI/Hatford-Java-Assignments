package org.example;

import java.util.UUID;

public class Booking {
    private String bookingId;
    private Show show;
    private Seat seat;

    public Booking(Show show, Seat seat) {
        this.bookingId = UUID.randomUUID().toString();
        this.show = show;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                "\nMovie: " + show.getMovie().getTitle() +
                "\nShow Time: " + show.getShowTime() +
                "\nSeat: " + seat.getSeatNumber();
    }
}

