package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Show {
    private Movie movie;
    private String showTime;
    private List<Seat> seats;

    public Show(Movie movie, String showTime, int totalSeats) {
        this.movie = movie;
        this.showTime = showTime;
        this.seats = new ArrayList<>();

        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public Movie getMovie() { return movie; }
    public String getShowTime() { return showTime; }
    public List<Seat> getSeats() { return seats; }

    public List<Seat> getAvailableSeats() {
        return seats.stream()
                .filter(seat -> !seat.isBooked())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return movie.getTitle() + " at " + showTime;
    }
}
