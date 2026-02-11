package org.example;

import java.util.List;

public class Theatre {
    private String name;
    private List<Show> shows;

    public Theatre(String name, List<Show> shows) {
        this.name = name;
        this.shows = shows;
    }

    public List<Show> getShows() {
        return shows;
    }
}
