package com.movies.moviescommerce.dao;
import com.movies.moviescommerce.model.Movie;
import java.util.List;

public interface MovieDao {
    public List<Movie> findAll();
    public Movie findById(int id);
    public Movie save(Movie movie);
}
