package com.movies.moviescommerce.dao;
import com.movies.moviescommerce.model.Movie;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieDaoImpl implements MovieDao {

    public static List<Movie>movies=new ArrayList<>();
    static {
        movies.add(new Movie(1, new String("Avatar")));
        movies.add(new Movie(2, new String("Titanic")));
        movies.add(new Movie(3, new String("Hunger Games")));
        movies.add(new Movie(4, new String("JPP")));
    }

    @Override
    public List<Movie>findAll() {
        return movies;
    }

    @Override
    public List<Movie> findAll(Sort sort) {
        return null;
    }

    @Override
    public Movie save(Movie movie){
        movies.add(movie);
        return movie;
    }


    @Override
    public Page<Movie> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Movie> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Movie entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Movie> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Movie> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Movie> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Movie> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Movie> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Movie getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Movie> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Movie> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Movie> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Movie> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Movie> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Movie> boolean exists(Example<S> example) {
        return false;
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
