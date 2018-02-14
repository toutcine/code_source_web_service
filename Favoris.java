package com.example.springbootmongodb;

public class Favoris {
    private String id;
    private String idClient;
    private String idFilm;
    private String date;

    public Favoris(){

    }

    public Favoris(String idClient, String idFilm, String date) {
        this.idClient = idClient;
        this.idFilm = idFilm;
        this.date = date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {

        return id;
    }

    public String getIdClient() {
        return idClient;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public String getDate() {
        return date;
    }
}
