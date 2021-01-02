package com.movies.moviescommerce.Actor;

import java.util.Objects;


public class Actor {
    private  int id;
    private  String nom;
    private  String movieName;

    Actor(int id, String nom, String movieName) {
        this.id = id;
        this.nom = nom;
        this.movieName = movieName;
    }

    public int id() {
        return id;
    }

    public String nom() {
        return nom;
    }

    public String movieName() {
        return movieName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Actor) obj;
        return this.id == that.id &&
                Objects.equals(this.nom, that.nom) &&
                Objects.equals(this.movieName, that.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, movieName);
    }

    @Override
    public String toString() {
        return "ActorModel[" +
                "id=" + id + ", " +
                "nom=" + nom + ", " +
                "movieName=" + movieName + ']';
    }


}
