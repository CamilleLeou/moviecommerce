package com.movies.moviescommerce.dao;
import com.movies.moviescommerce.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieDaoImpl implements MovieDao {

    public static List<Movie>movies=new ArrayList<>();
    static {
        movies.add(new Movie(1, new String("Avatar")));
        movies.add(new Movie(2, new String("Titanic")));
        movies.add(new Movie(3, new String("Hunger Games")));
    }

    @Override
    public List<Movie>findAll() {
        return movies;
    }

    @Override
    public Movie findById(int id){
        for (Movie movie : movies) {
            if(movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie save(Movie movie){
        movies.add(movie);
        return movie;
    }
/*    @Override
    public List<Movie>findAll() {
        return null;
    }

    @Override
    public Movie findById(int id) {
        return null;
    }

    @Override
    public Movie save(Movie movie) {
        return null;
    }*/


}
