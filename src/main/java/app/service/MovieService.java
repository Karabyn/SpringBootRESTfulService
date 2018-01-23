package app.service;

import app.entity.Movie;

import java.util.List;

/**
 * Created by Petro Karabyn
 * on 23-Jan-18
 */

public interface MovieService {

    void createMovie(Movie movie);

    void deleteMovie(int movieId);

    List<Movie> getMovies();

    Movie getMovieByName(String name);

}
