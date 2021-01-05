package com.movies.moviescommerce.dao;
import com.movies.moviescommerce.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

    public List<Movie> findAll();
    public Movie findById(int id);
    public Movie save(Movie movie);
}
