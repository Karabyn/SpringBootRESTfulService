package app.service;

import app.entity.Movie;
import app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Petro Karabyn
 * on 23-Jan-18
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(int movieId) {
        movieRepository.delete(movieId);
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieByName(String name) {
        return movieRepository.getMovieByName(name);
    }
}
