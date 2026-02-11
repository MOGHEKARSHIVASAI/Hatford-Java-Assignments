package org.example;

import java.util.List;
import java.util.Optional;

public class BookingService {

    public Optional<Booking> bookSeat(Show show, int seatNumber) {

        Optional<Seat> seatOptional = show.getSeats()
                .stream()
                .filter(seat -> seat.getSeatNumber() == seatNumber)
                .findFirst();

        if (seatOptional.isPresent() && !seatOptional.get().isBooked()) {
            seatOptional.get().bookSeat();
            return Optional.of(new Booking(show, seatOptional.get()));
        }

        return Optional.empty();
    }
}
