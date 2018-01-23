package app.repository;

import app.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Petro Karabyn
 * on 23-Jan-18
 */
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie getMovieByName(String name);

}
