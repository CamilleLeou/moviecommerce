package com.movies.moviescommerce.web.controller;
import com.movies.moviescommerce.dao.MovieDao;
import com.movies.moviescommerce.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class moviecontroller {

    @Autowired
    private MovieDao movies;

    //récupère la liste de films
    @RequestMapping(value="/Movies", method= RequestMethod.GET)
    public List<Movie> listMovies() {
        return movies.findAll();
    }

    //récupère un film par son id
    @GetMapping(value="/Movies/{id}")
    public Movie afficherUnFilm(@PathVariable int id) {
        return movies.findById(id);
    }

}

