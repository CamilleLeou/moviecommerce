package com.movies.moviescommerce.model;

public class Movie {
    private int id;
    private String nom;

    public Movie() {
    }

    public Movie(int id, String nom) {
        this.id=id;
        this.nom=nom;
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
                ", nom='"+ nom + '\'' + '}';
    }
}
