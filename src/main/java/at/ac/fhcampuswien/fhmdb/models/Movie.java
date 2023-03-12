package at.ac.fhcampuswien.fhmdb.models;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(object == this){
            return true;
        }
        if(!(object instanceof Movie other)){
            return false;
        }
        return this.title.equals(other.title) && this.description.equals(other.description) && this.genres.equals(other.genres);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Genre> getGenres() { return genres; }

    public static List<Movie> initializeMovies(){
        List<Movie> movies = new ArrayList<>();
        // TODO add some dummy data here

        movies.add(new Movie(
                "The Dawg",
                "Movie about a cute dawg.",
                Arrays.asList(Genre.ANIMATION, Genre.FAMILY)
        ));
        movies.add(new Movie(
                "TitansAdventure",
                "A cute Titan on an adventure.",
                Arrays.asList(Genre.ANIMATION, Genre.ADVENTURE)
        ));
        movies.add(new Movie(
                "Generic Movie Title",
                "Generic movie description.",
                Arrays.asList(Genre.MYSTERY)
        ));
        movies.add(new Movie(
                "The Movie",
                "The description.",
                Arrays.asList(Genre.COMEDY)
        ));

        return movies;
    }
}
