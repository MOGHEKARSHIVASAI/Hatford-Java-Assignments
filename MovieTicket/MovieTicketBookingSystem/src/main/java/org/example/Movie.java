package org.example;

import java.util.UUID;

public class Movie {
    private String id;
    private String title;
    private String genre;
    private double rating;

    public Movie(String title, String genre, double rating) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return title + " | Genre: " + genre + " | Rating: " + rating;
    }
}
