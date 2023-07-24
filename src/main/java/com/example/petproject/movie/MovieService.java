package com.example.petproject.movie;

import com.example.petproject.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    private final MovieDao movieDao;

    public MovieService(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public List<Movie> getMovies() {
        return movieDao.selectMovies();
    }

    public void addNewMovie(Movie movie) {
        // TODO: check if movie exists
        movieDao.insertMovie(movie);
    }

    public void deleteMovie(Integer id) {
            int result = movieDao.deleteMovie(id);
    }

    public Movie getMovie(int id) {
        return movieDao.selectMovieById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Movie with id %s not found", id)));
    }
}
