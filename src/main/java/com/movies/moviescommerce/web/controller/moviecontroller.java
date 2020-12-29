package com.movies.moviescommerce.web.controller;
import com.movies.moviescommerce.dao.MovieDao;
import com.movies.moviescommerce.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class moviecontroller {

    @Autowired
    private MovieDao movieDao;

    //récupère la liste de films
    @RequestMapping(value="/Movies", method= RequestMethod.GET)
    public List<Movie> listMovies() {
        return movieDao.findAll();
    }

    //récupère un film par son id
    @GetMapping(value="/Movies/{id}")
    public Movie afficherUnFilm(@PathVariable int id) {
        return movieDao.findById(id);
    }

    @PostMapping(value= "/Movies")
    public void ajouterUnFilm(@RequestBody Movie movie) {
        movieDao.save(movie);
    }

}

