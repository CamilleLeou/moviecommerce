package com.movies.moviescommerce.model;
import com.movies.moviescommerce.Actor.Actor;
import com.movies.moviescommerce.Actor.ActorService;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Movie {

    @Id
    @GeneratedValue
    private int id;
    private String nom;

    public Movie() {
    }

    public Movie(int id, String nom) {
        this.id=id;
        this.nom=nom;
    }

    @Transient
    private List<Actor> actors;

    public void addActor(Actor actor) {
        if (this.actors == null) {
            this.actors = new ArrayList<>();
        }
        this.actors.add(actor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom=nom;
    }


    @Override
    public String toString(){
        return "Product{"+
                "id=" + id +
                ", nom='"+ nom +
                ", acteur='" + actors + '\'' + '}';
    }
}
