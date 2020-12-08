package com.movies.moviescommerce.web.controller;
import com.movies.moviescommerce.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class moviecontroller {
    @RequestMapping(value="/Movies", method= RequestMethod.GET)
    public String MovieList() {
        return "Avatar";
    }

    @RequestMapping(value = "/Movies/{id}", method = RequestMethod.GET)
    public Movie displayMovie(@PathVariable int id) {
        Movie avatar=new Movie(id, new String ("Avatar"));
        return avatar;
    }

}

