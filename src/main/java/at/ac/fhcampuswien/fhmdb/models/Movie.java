package at.ac.fhcampuswien.fhmdb.models;

import java.util.ArrayList;
import java.util.List;
import at.ac.fhcampuswien.fhmdb.models.Movie;

public class Movie {
    private String title;
    private String description;

    // TODO add more properties here

    private List<Genre> genres;

    public Movie(String title, String description, List<Genre> genres) {
        this.title = title;
        this.description = description;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static List<Movie> initializeMovies(){
        List<Movie> movies = new ArrayList<>();
        // TODO add some dummy data here

        return movies;
    }
}
