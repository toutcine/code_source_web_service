package com.example.springbootmongodb;

public class Comment {
    private String id;
    private String idClient;
    private String idFilm;
    private String date;
    private String commentaire;

    public Comment(String idClient, String idFilm, String date, String commentaire) {
        this.idClient = idClient;
        this.idFilm = idFilm;
        this.date = date;
        this.commentaire = commentaire;
    }

    public Comment() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {

        return id;
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

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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

    public String getCommentaire() {
        return commentaire;
    }
}
